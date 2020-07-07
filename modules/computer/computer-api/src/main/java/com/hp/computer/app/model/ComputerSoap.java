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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class ComputerSoap implements Serializable {
	public static ComputerSoap toSoapModel(Computer model) {
		ComputerSoap soapModel = new ComputerSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setComputerId(model.getComputerId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setCompany(model.getCompany());
		soapModel.setModelName(model.getModelName());
		soapModel.setOperatingSystem(model.getOperatingSystem());
		soapModel.setCost(model.getCost());
		soapModel.setRating(model.getRating());

		return soapModel;
	}

	public static ComputerSoap[] toSoapModels(Computer[] models) {
		ComputerSoap[] soapModels = new ComputerSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ComputerSoap[][] toSoapModels(Computer[][] models) {
		ComputerSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ComputerSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ComputerSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ComputerSoap[] toSoapModels(List<Computer> models) {
		List<ComputerSoap> soapModels = new ArrayList<ComputerSoap>(models.size());

		for (Computer model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ComputerSoap[soapModels.size()]);
	}

	public ComputerSoap() {
	}

	public long getPrimaryKey() {
		return _computerId;
	}

	public void setPrimaryKey(long pk) {
		setComputerId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getComputerId() {
		return _computerId;
	}

	public void setComputerId(long computerId) {
		_computerId = computerId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public String getCompany() {
		return _company;
	}

	public void setCompany(String company) {
		_company = company;
	}

	public String getModelName() {
		return _modelName;
	}

	public void setModelName(String modelName) {
		_modelName = modelName;
	}

	public String getOperatingSystem() {
		return _operatingSystem;
	}

	public void setOperatingSystem(String operatingSystem) {
		_operatingSystem = operatingSystem;
	}

	public double getCost() {
		return _cost;
	}

	public void setCost(double cost) {
		_cost = cost;
	}

	public int getRating() {
		return _rating;
	}

	public void setRating(int rating) {
		_rating = rating;
	}

	private String _uuid;
	private long _computerId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _company;
	private String _modelName;
	private String _operatingSystem;
	private double _cost;
	private int _rating;
}