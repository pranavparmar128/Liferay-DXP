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

package com.hp.computer.app.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ComputerLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see ComputerLocalService
 * @generated
 */
@ProviderType
public class ComputerLocalServiceWrapper implements ComputerLocalService,
	ServiceWrapper<ComputerLocalService> {
	public ComputerLocalServiceWrapper(
		ComputerLocalService computerLocalService) {
		_computerLocalService = computerLocalService;
	}

	/**
	* Adds the computer to the database. Also notifies the appropriate model listeners.
	*
	* @param computer the computer
	* @return the computer that was added
	*/
	@Override
	public com.hp.computer.app.model.Computer addComputer(
		com.hp.computer.app.model.Computer computer) {
		return _computerLocalService.addComputer(computer);
	}

	/**
	* Creates a new computer with the primary key. Does not add the computer to the database.
	*
	* @param computerId the primary key for the new computer
	* @return the new computer
	*/
	@Override
	public com.hp.computer.app.model.Computer createComputer(long computerId) {
		return _computerLocalService.createComputer(computerId);
	}

	/**
	* Deletes the computer from the database. Also notifies the appropriate model listeners.
	*
	* @param computer the computer
	* @return the computer that was removed
	*/
	@Override
	public com.hp.computer.app.model.Computer deleteComputer(
		com.hp.computer.app.model.Computer computer) {
		return _computerLocalService.deleteComputer(computer);
	}

	/**
	* Deletes the computer with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param computerId the primary key of the computer
	* @return the computer that was removed
	* @throws PortalException if a computer with the primary key could not be found
	*/
	@Override
	public com.hp.computer.app.model.Computer deleteComputer(long computerId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _computerLocalService.deleteComputer(computerId);
	}

	@Override
	public com.hp.computer.app.model.Computer deleteComputerModel(
		long computerId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _computerLocalService.deleteComputerModel(computerId);
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _computerLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _computerLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _computerLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hp.computer.app.model.impl.ComputerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _computerLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hp.computer.app.model.impl.ComputerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _computerLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _computerLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return _computerLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.hp.computer.app.model.Computer fetchComputer(long computerId) {
		return _computerLocalService.fetchComputer(computerId);
	}

	/**
	* Returns the computer matching the UUID and group.
	*
	* @param uuid the computer's UUID
	* @param groupId the primary key of the group
	* @return the matching computer, or <code>null</code> if a matching computer could not be found
	*/
	@Override
	public com.hp.computer.app.model.Computer fetchComputerByUuidAndGroupId(
		String uuid, long groupId) {
		return _computerLocalService.fetchComputerByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _computerLocalService.getActionableDynamicQuery();
	}

	/**
	* Returns the computer with the primary key.
	*
	* @param computerId the primary key of the computer
	* @return the computer
	* @throws PortalException if a computer with the primary key could not be found
	*/
	@Override
	public com.hp.computer.app.model.Computer getComputer(long computerId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _computerLocalService.getComputer(computerId);
	}

	/**
	* Returns the computer matching the UUID and group.
	*
	* @param uuid the computer's UUID
	* @param groupId the primary key of the group
	* @return the matching computer
	* @throws PortalException if a matching computer could not be found
	*/
	@Override
	public com.hp.computer.app.model.Computer getComputerByUuidAndGroupId(
		String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _computerLocalService.getComputerByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns a range of all the computers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hp.computer.app.model.impl.ComputerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of computers
	* @param end the upper bound of the range of computers (not inclusive)
	* @return the range of computers
	*/
	@Override
	public java.util.List<com.hp.computer.app.model.Computer> getComputers(
		int start, int end) {
		return _computerLocalService.getComputers(start, end);
	}

	/**
	* Returns all the computers matching the UUID and company.
	*
	* @param uuid the UUID of the computers
	* @param companyId the primary key of the company
	* @return the matching computers, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<com.hp.computer.app.model.Computer> getComputersByUuidAndCompanyId(
		String uuid, long companyId) {
		return _computerLocalService.getComputersByUuidAndCompanyId(uuid,
			companyId);
	}

	/**
	* Returns a range of computers matching the UUID and company.
	*
	* @param uuid the UUID of the computers
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of computers
	* @param end the upper bound of the range of computers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching computers, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<com.hp.computer.app.model.Computer> getComputersByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.hp.computer.app.model.Computer> orderByComparator) {
		return _computerLocalService.getComputersByUuidAndCompanyId(uuid,
			companyId, start, end, orderByComparator);
	}

	/**
	* Returns the number of computers.
	*
	* @return the number of computers
	*/
	@Override
	public int getComputersCount() {
		return _computerLocalService.getComputersCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return _computerLocalService.getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _computerLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public String getOSGiServiceIdentifier() {
		return _computerLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _computerLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Updates the computer in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param computer the computer
	* @return the computer that was updated
	*/
	@Override
	public com.hp.computer.app.model.Computer updateComputer(
		com.hp.computer.app.model.Computer computer) {
		return _computerLocalService.updateComputer(computer);
	}

	@Override
	public com.hp.computer.app.model.Computer updateComputerModel(
		com.hp.computer.app.model.Computer computer)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _computerLocalService.updateComputerModel(computer);
	}

	@Override
	public ComputerLocalService getWrappedService() {
		return _computerLocalService;
	}

	@Override
	public void setWrappedService(ComputerLocalService computerLocalService) {
		_computerLocalService = computerLocalService;
	}

	private ComputerLocalService _computerLocalService;
}