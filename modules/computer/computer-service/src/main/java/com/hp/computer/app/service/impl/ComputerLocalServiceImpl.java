/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.hp.computer.app.service.impl;

import com.hp.computer.app.model.Computer;
import com.hp.computer.app.service.base.ComputerLocalServiceBaseImpl;
import com.liferay.asset.kernel.model.AssetEntry;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;

/**
 * The implementation of the computer local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.hp.computer.app.service.ComputerLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ComputerLocalServiceBaseImpl
 * @see com.hp.computer.app.service.ComputerLocalServiceUtil
 */
public class ComputerLocalServiceImpl extends ComputerLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link com.hp.computer.app.service.ComputerLocalServiceUtil} to access the computer local service.
	 */
	
	@Indexable(type=IndexableType.REINDEX)
	public Computer updateComputerModel(Computer computer) throws PortalException {
		
		assetEntryLocalService.updateEntry(
			computer.getUserId(), computer.getGroupId(), computer.getCreateDate(),
			computer.getModifiedDate(), Computer.class.getName(), computer.getComputerId(),
			computer.getUuid(), 0, null, null, true, false,
			null, null, null, null, null, computer.getModelName(), null, null, null,
			null, 0, 0, null);
	
		return computerPersistence.update(computer);
	}
	
	@Indexable(type=IndexableType.DELETE)
	public Computer deleteComputerModel(long computerId) throws PortalException {
		
		AssetEntry entry = assetEntryLocalService.fetchEntry(Computer.class.getName(), computerId);
		assetEntryLocalService.deleteEntry(entry);
			
		return computerPersistence.remove(computerId);
	}
}