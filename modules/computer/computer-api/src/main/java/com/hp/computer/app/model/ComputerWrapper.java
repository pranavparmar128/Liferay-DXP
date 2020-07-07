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

package com.hp.computer.app.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.exportimport.kernel.lar.StagedModelType;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link Computer}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Computer
 * @generated
 */
@ProviderType
public class ComputerWrapper implements Computer, ModelWrapper<Computer> {
	public ComputerWrapper(Computer computer) {
		_computer = computer;
	}

	@Override
	public Class<?> getModelClass() {
		return Computer.class;
	}

	@Override
	public String getModelClassName() {
		return Computer.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("computerId", getComputerId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("company", getCompany());
		attributes.put("modelName", getModelName());
		attributes.put("operatingSystem", getOperatingSystem());
		attributes.put("cost", getCost());
		attributes.put("rating", getRating());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long computerId = (Long)attributes.get("computerId");

		if (computerId != null) {
			setComputerId(computerId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String company = (String)attributes.get("company");

		if (company != null) {
			setCompany(company);
		}

		String modelName = (String)attributes.get("modelName");

		if (modelName != null) {
			setModelName(modelName);
		}

		String operatingSystem = (String)attributes.get("operatingSystem");

		if (operatingSystem != null) {
			setOperatingSystem(operatingSystem);
		}

		Double cost = (Double)attributes.get("cost");

		if (cost != null) {
			setCost(cost);
		}

		Integer rating = (Integer)attributes.get("rating");

		if (rating != null) {
			setRating(rating);
		}
	}

	@Override
	public Object clone() {
		return new ComputerWrapper((Computer)_computer.clone());
	}

	@Override
	public int compareTo(Computer computer) {
		return _computer.compareTo(computer);
	}

	/**
	* Returns the company of this computer.
	*
	* @return the company of this computer
	*/
	@Override
	public String getCompany() {
		return _computer.getCompany();
	}

	/**
	* Returns the company ID of this computer.
	*
	* @return the company ID of this computer
	*/
	@Override
	public long getCompanyId() {
		return _computer.getCompanyId();
	}

	/**
	* Returns the computer ID of this computer.
	*
	* @return the computer ID of this computer
	*/
	@Override
	public long getComputerId() {
		return _computer.getComputerId();
	}

	/**
	* Returns the cost of this computer.
	*
	* @return the cost of this computer
	*/
	@Override
	public double getCost() {
		return _computer.getCost();
	}

	/**
	* Returns the create date of this computer.
	*
	* @return the create date of this computer
	*/
	@Override
	public Date getCreateDate() {
		return _computer.getCreateDate();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _computer.getExpandoBridge();
	}

	/**
	* Returns the group ID of this computer.
	*
	* @return the group ID of this computer
	*/
	@Override
	public long getGroupId() {
		return _computer.getGroupId();
	}

	/**
	* Returns the model name of this computer.
	*
	* @return the model name of this computer
	*/
	@Override
	public String getModelName() {
		return _computer.getModelName();
	}

	/**
	* Returns the modified date of this computer.
	*
	* @return the modified date of this computer
	*/
	@Override
	public Date getModifiedDate() {
		return _computer.getModifiedDate();
	}

	/**
	* Returns the operating system of this computer.
	*
	* @return the operating system of this computer
	*/
	@Override
	public String getOperatingSystem() {
		return _computer.getOperatingSystem();
	}

	/**
	* Returns the primary key of this computer.
	*
	* @return the primary key of this computer
	*/
	@Override
	public long getPrimaryKey() {
		return _computer.getPrimaryKey();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _computer.getPrimaryKeyObj();
	}

	/**
	* Returns the rating of this computer.
	*
	* @return the rating of this computer
	*/
	@Override
	public int getRating() {
		return _computer.getRating();
	}

	/**
	* Returns the user ID of this computer.
	*
	* @return the user ID of this computer
	*/
	@Override
	public long getUserId() {
		return _computer.getUserId();
	}

	/**
	* Returns the user name of this computer.
	*
	* @return the user name of this computer
	*/
	@Override
	public String getUserName() {
		return _computer.getUserName();
	}

	/**
	* Returns the user uuid of this computer.
	*
	* @return the user uuid of this computer
	*/
	@Override
	public String getUserUuid() {
		return _computer.getUserUuid();
	}

	/**
	* Returns the uuid of this computer.
	*
	* @return the uuid of this computer
	*/
	@Override
	public String getUuid() {
		return _computer.getUuid();
	}

	@Override
	public int hashCode() {
		return _computer.hashCode();
	}

	@Override
	public boolean isCachedModel() {
		return _computer.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _computer.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _computer.isNew();
	}

	@Override
	public void persist() {
		_computer.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_computer.setCachedModel(cachedModel);
	}

	/**
	* Sets the company of this computer.
	*
	* @param company the company of this computer
	*/
	@Override
	public void setCompany(String company) {
		_computer.setCompany(company);
	}

	/**
	* Sets the company ID of this computer.
	*
	* @param companyId the company ID of this computer
	*/
	@Override
	public void setCompanyId(long companyId) {
		_computer.setCompanyId(companyId);
	}

	/**
	* Sets the computer ID of this computer.
	*
	* @param computerId the computer ID of this computer
	*/
	@Override
	public void setComputerId(long computerId) {
		_computer.setComputerId(computerId);
	}

	/**
	* Sets the cost of this computer.
	*
	* @param cost the cost of this computer
	*/
	@Override
	public void setCost(double cost) {
		_computer.setCost(cost);
	}

	/**
	* Sets the create date of this computer.
	*
	* @param createDate the create date of this computer
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_computer.setCreateDate(createDate);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_computer.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_computer.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_computer.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this computer.
	*
	* @param groupId the group ID of this computer
	*/
	@Override
	public void setGroupId(long groupId) {
		_computer.setGroupId(groupId);
	}

	/**
	* Sets the model name of this computer.
	*
	* @param modelName the model name of this computer
	*/
	@Override
	public void setModelName(String modelName) {
		_computer.setModelName(modelName);
	}

	/**
	* Sets the modified date of this computer.
	*
	* @param modifiedDate the modified date of this computer
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_computer.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_computer.setNew(n);
	}

	/**
	* Sets the operating system of this computer.
	*
	* @param operatingSystem the operating system of this computer
	*/
	@Override
	public void setOperatingSystem(String operatingSystem) {
		_computer.setOperatingSystem(operatingSystem);
	}

	/**
	* Sets the primary key of this computer.
	*
	* @param primaryKey the primary key of this computer
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_computer.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_computer.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the rating of this computer.
	*
	* @param rating the rating of this computer
	*/
	@Override
	public void setRating(int rating) {
		_computer.setRating(rating);
	}

	/**
	* Sets the user ID of this computer.
	*
	* @param userId the user ID of this computer
	*/
	@Override
	public void setUserId(long userId) {
		_computer.setUserId(userId);
	}

	/**
	* Sets the user name of this computer.
	*
	* @param userName the user name of this computer
	*/
	@Override
	public void setUserName(String userName) {
		_computer.setUserName(userName);
	}

	/**
	* Sets the user uuid of this computer.
	*
	* @param userUuid the user uuid of this computer
	*/
	@Override
	public void setUserUuid(String userUuid) {
		_computer.setUserUuid(userUuid);
	}

	/**
	* Sets the uuid of this computer.
	*
	* @param uuid the uuid of this computer
	*/
	@Override
	public void setUuid(String uuid) {
		_computer.setUuid(uuid);
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<Computer> toCacheModel() {
		return _computer.toCacheModel();
	}

	@Override
	public Computer toEscapedModel() {
		return new ComputerWrapper(_computer.toEscapedModel());
	}

	@Override
	public String toString() {
		return _computer.toString();
	}

	@Override
	public Computer toUnescapedModel() {
		return new ComputerWrapper(_computer.toUnescapedModel());
	}

	@Override
	public String toXmlString() {
		return _computer.toXmlString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ComputerWrapper)) {
			return false;
		}

		ComputerWrapper computerWrapper = (ComputerWrapper)obj;

		if (Objects.equals(_computer, computerWrapper._computer)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _computer.getStagedModelType();
	}

	@Override
	public Computer getWrappedModel() {
		return _computer;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _computer.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _computer.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_computer.resetOriginalValues();
	}

	private final Computer _computer;
}