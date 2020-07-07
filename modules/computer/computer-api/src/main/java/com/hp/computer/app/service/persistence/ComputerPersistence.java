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

package com.hp.computer.app.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.hp.computer.app.exception.NoSuchComputerException;
import com.hp.computer.app.model.Computer;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the computer service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.hp.computer.app.service.persistence.impl.ComputerPersistenceImpl
 * @see ComputerUtil
 * @generated
 */
@ProviderType
public interface ComputerPersistence extends BasePersistence<Computer> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ComputerUtil} to access the computer persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the computers where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching computers
	*/
	public java.util.List<Computer> findByUuid(String uuid);

	/**
	* Returns a range of all the computers where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ComputerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of computers
	* @param end the upper bound of the range of computers (not inclusive)
	* @return the range of matching computers
	*/
	public java.util.List<Computer> findByUuid(String uuid, int start, int end);

	/**
	* Returns an ordered range of all the computers where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ComputerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of computers
	* @param end the upper bound of the range of computers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching computers
	*/
	public java.util.List<Computer> findByUuid(String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Computer> orderByComparator);

	/**
	* Returns an ordered range of all the computers where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ComputerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of computers
	* @param end the upper bound of the range of computers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching computers
	*/
	public java.util.List<Computer> findByUuid(String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Computer> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first computer in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching computer
	* @throws NoSuchComputerException if a matching computer could not be found
	*/
	public Computer findByUuid_First(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Computer> orderByComparator)
		throws NoSuchComputerException;

	/**
	* Returns the first computer in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching computer, or <code>null</code> if a matching computer could not be found
	*/
	public Computer fetchByUuid_First(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Computer> orderByComparator);

	/**
	* Returns the last computer in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching computer
	* @throws NoSuchComputerException if a matching computer could not be found
	*/
	public Computer findByUuid_Last(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Computer> orderByComparator)
		throws NoSuchComputerException;

	/**
	* Returns the last computer in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching computer, or <code>null</code> if a matching computer could not be found
	*/
	public Computer fetchByUuid_Last(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Computer> orderByComparator);

	/**
	* Returns the computers before and after the current computer in the ordered set where uuid = &#63;.
	*
	* @param computerId the primary key of the current computer
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next computer
	* @throws NoSuchComputerException if a computer with the primary key could not be found
	*/
	public Computer[] findByUuid_PrevAndNext(long computerId, String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Computer> orderByComparator)
		throws NoSuchComputerException;

	/**
	* Removes all the computers where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(String uuid);

	/**
	* Returns the number of computers where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching computers
	*/
	public int countByUuid(String uuid);

	/**
	* Returns the computer where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchComputerException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching computer
	* @throws NoSuchComputerException if a matching computer could not be found
	*/
	public Computer findByUUID_G(String uuid, long groupId)
		throws NoSuchComputerException;

	/**
	* Returns the computer where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching computer, or <code>null</code> if a matching computer could not be found
	*/
	public Computer fetchByUUID_G(String uuid, long groupId);

	/**
	* Returns the computer where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching computer, or <code>null</code> if a matching computer could not be found
	*/
	public Computer fetchByUUID_G(String uuid, long groupId,
		boolean retrieveFromCache);

	/**
	* Removes the computer where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the computer that was removed
	*/
	public Computer removeByUUID_G(String uuid, long groupId)
		throws NoSuchComputerException;

	/**
	* Returns the number of computers where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching computers
	*/
	public int countByUUID_G(String uuid, long groupId);

	/**
	* Returns all the computers where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching computers
	*/
	public java.util.List<Computer> findByUuid_C(String uuid, long companyId);

	/**
	* Returns a range of all the computers where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ComputerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of computers
	* @param end the upper bound of the range of computers (not inclusive)
	* @return the range of matching computers
	*/
	public java.util.List<Computer> findByUuid_C(String uuid, long companyId,
		int start, int end);

	/**
	* Returns an ordered range of all the computers where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ComputerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of computers
	* @param end the upper bound of the range of computers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching computers
	*/
	public java.util.List<Computer> findByUuid_C(String uuid, long companyId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Computer> orderByComparator);

	/**
	* Returns an ordered range of all the computers where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ComputerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of computers
	* @param end the upper bound of the range of computers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching computers
	*/
	public java.util.List<Computer> findByUuid_C(String uuid, long companyId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Computer> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first computer in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching computer
	* @throws NoSuchComputerException if a matching computer could not be found
	*/
	public Computer findByUuid_C_First(String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Computer> orderByComparator)
		throws NoSuchComputerException;

	/**
	* Returns the first computer in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching computer, or <code>null</code> if a matching computer could not be found
	*/
	public Computer fetchByUuid_C_First(String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Computer> orderByComparator);

	/**
	* Returns the last computer in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching computer
	* @throws NoSuchComputerException if a matching computer could not be found
	*/
	public Computer findByUuid_C_Last(String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Computer> orderByComparator)
		throws NoSuchComputerException;

	/**
	* Returns the last computer in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching computer, or <code>null</code> if a matching computer could not be found
	*/
	public Computer fetchByUuid_C_Last(String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Computer> orderByComparator);

	/**
	* Returns the computers before and after the current computer in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param computerId the primary key of the current computer
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next computer
	* @throws NoSuchComputerException if a computer with the primary key could not be found
	*/
	public Computer[] findByUuid_C_PrevAndNext(long computerId, String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Computer> orderByComparator)
		throws NoSuchComputerException;

	/**
	* Removes all the computers where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public void removeByUuid_C(String uuid, long companyId);

	/**
	* Returns the number of computers where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching computers
	*/
	public int countByUuid_C(String uuid, long companyId);

	/**
	* Caches the computer in the entity cache if it is enabled.
	*
	* @param computer the computer
	*/
	public void cacheResult(Computer computer);

	/**
	* Caches the computers in the entity cache if it is enabled.
	*
	* @param computers the computers
	*/
	public void cacheResult(java.util.List<Computer> computers);

	/**
	* Creates a new computer with the primary key. Does not add the computer to the database.
	*
	* @param computerId the primary key for the new computer
	* @return the new computer
	*/
	public Computer create(long computerId);

	/**
	* Removes the computer with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param computerId the primary key of the computer
	* @return the computer that was removed
	* @throws NoSuchComputerException if a computer with the primary key could not be found
	*/
	public Computer remove(long computerId) throws NoSuchComputerException;

	public Computer updateImpl(Computer computer);

	/**
	* Returns the computer with the primary key or throws a {@link NoSuchComputerException} if it could not be found.
	*
	* @param computerId the primary key of the computer
	* @return the computer
	* @throws NoSuchComputerException if a computer with the primary key could not be found
	*/
	public Computer findByPrimaryKey(long computerId)
		throws NoSuchComputerException;

	/**
	* Returns the computer with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param computerId the primary key of the computer
	* @return the computer, or <code>null</code> if a computer with the primary key could not be found
	*/
	public Computer fetchByPrimaryKey(long computerId);

	@Override
	public java.util.Map<java.io.Serializable, Computer> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the computers.
	*
	* @return the computers
	*/
	public java.util.List<Computer> findAll();

	/**
	* Returns a range of all the computers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ComputerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of computers
	* @param end the upper bound of the range of computers (not inclusive)
	* @return the range of computers
	*/
	public java.util.List<Computer> findAll(int start, int end);

	/**
	* Returns an ordered range of all the computers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ComputerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of computers
	* @param end the upper bound of the range of computers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of computers
	*/
	public java.util.List<Computer> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Computer> orderByComparator);

	/**
	* Returns an ordered range of all the computers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ComputerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of computers
	* @param end the upper bound of the range of computers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of computers
	*/
	public java.util.List<Computer> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Computer> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the computers from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of computers.
	*
	* @return the number of computers
	*/
	public int countAll();

	@Override
	public java.util.Set<String> getBadColumnNames();
}