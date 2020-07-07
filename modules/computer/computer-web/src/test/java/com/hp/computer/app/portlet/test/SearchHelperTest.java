package com.hp.computer.app.portlet.test;

import static org.junit.Assert.assertEquals;

import com.hp.computer.app.model.Computer;
import com.hp.computer.app.portlet.util.SearchHelper;
import com.hp.computer.app.search.field.ComputerFields;
import com.hp.computer.app.service.ComputerLocalService;
import com.liferay.portal.kernel.search.Document;
import com.liferay.portal.kernel.search.Hits;
import com.liferay.portal.kernel.search.Indexer;
import com.liferay.portal.kernel.search.IndexerRegistry;
import com.liferay.portal.kernel.search.ParseException;
import com.liferay.portal.kernel.search.SearchContext;
import com.liferay.portal.kernel.search.SearchException;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.powermock.api.mockito.PowerMockito;

@RunWith(MockitoJUnitRunner.class)
public class SearchHelperTest extends PowerMockito {

	@Before
	public void setup() {
		_searchHelper = new SearchHelper();
	}
	
	@Test
	public void searchEmptyKeyowrd() throws ParseException, SearchException {

		Computer computer1 = mock(Computer.class);
		computer1.setCompany("Dell");

		Computer computer2 = mock(Computer.class);
		computer2.setCompany("HP");
		
		List<Computer> list = new ArrayList<Computer>();
		list.add(computer1);
		list.add(computer2);

		SearchContext searchContext = mock(SearchContext.class);
		
		when(_computerLocalService.getComputers(-1, -1)).thenReturn(list);		

		_searchHelper.setComputerLocalService(_computerLocalService);
		
		List<Computer> computerList = _searchHelper.searchComputer(searchContext);
		
		assertEquals(list.size(), computerList.size());
	}


	@Test
	public void searchWithMatchingKeyword() throws ParseException, SearchException {
		
		Document document = mock(Document.class);
		document.addText(ComputerFields.COMPANY, "Dell");

		List<Document> documents = new ArrayList<Document>();
		documents.add(document);
		
		Computer computer = mock(Computer.class);
		
		Hits hits = mock(Hits.class);
		
		when(searchContext.getKeywords()).thenReturn("Dell");
		when(_indexerRegistry.getIndexer(Computer.class)).thenReturn(indexer);
		when(indexer.search(searchContext)).thenReturn(hits);
		
		when(hits.toList()).thenReturn(documents);
		
		when(_computerLocalService.createComputer(0)).thenReturn(computer);
		
		when(document.get(ComputerFields.COMPANY)).thenReturn("TEST");
		
		_searchHelper.setIndexerRegistry(_indexerRegistry);
		_searchHelper.setComputerLocalService(_computerLocalService);

		List<Computer> computerList = _searchHelper.searchComputer(searchContext);
		
		assertEquals(computerList.size(), 1);
	}
	
	
	@Test
	public void searchWithoutMatchingKeyword() throws ParseException, SearchException {
		
		Document document = mock(Document.class);
		document.addText(ComputerFields.COMPANY, "Apple");

		List<Document> documents = new ArrayList<Document>();
		
		Hits hits = mock(Hits.class);
		
		when(searchContext.getKeywords()).thenReturn("Dell");
		when(_indexerRegistry.getIndexer(Computer.class)).thenReturn(indexer);
		when(indexer.search(searchContext)).thenReturn(hits);
		
		when(hits.toList()).thenReturn(documents);
		
		when(document.get(ComputerFields.COMPANY)).thenReturn("TEST");
		
		_searchHelper.setIndexerRegistry(_indexerRegistry);
		_searchHelper.setComputerLocalService(_computerLocalService);

		List<Computer> computerList = _searchHelper.searchComputer(searchContext);
		
		assertEquals(computerList.size(), 0);
	}
	
	private SearchHelper _searchHelper;
	
	@Mock
	private Indexer<Computer> indexer;
	
	@Mock
	private SearchContext searchContext;
	
	@Mock
	private IndexerRegistry _indexerRegistry;
	
	@Mock
	private ComputerLocalService _computerLocalService;
}
