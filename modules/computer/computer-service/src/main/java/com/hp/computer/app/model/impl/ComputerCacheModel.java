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

package com.hp.computer.app.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.hp.computer.app.model.Computer;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Computer in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Computer
 * @generated
 */
@ProviderType
public class ComputerCacheModel implements CacheModel<Computer>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ComputerCacheModel)) {
			return false;
		}

		ComputerCacheModel computerCacheModel = (ComputerCacheModel)obj;

		if (computerId == computerCacheModel.computerId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, computerId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", computerId=");
		sb.append(computerId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", company=");
		sb.append(company);
		sb.append(", modelName=");
		sb.append(modelName);
		sb.append(", operatingSystem=");
		sb.append(operatingSystem);
		sb.append(", cost=");
		sb.append(cost);
		sb.append(", rating=");
		sb.append(rating);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Computer toEntityModel() {
		ComputerImpl computerImpl = new ComputerImpl();

		if (uuid == null) {
			computerImpl.setUuid("");
		}
		else {
			computerImpl.setUuid(uuid);
		}

		computerImpl.setComputerId(computerId);
		computerImpl.setGroupId(groupId);
		computerImpl.setCompanyId(companyId);
		computerImpl.setUserId(userId);

		if (userName == null) {
			computerImpl.setUserName("");
		}
		else {
			computerImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			computerImpl.setCreateDate(null);
		}
		else {
			computerImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			computerImpl.setModifiedDate(null);
		}
		else {
			computerImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (company == null) {
			computerImpl.setCompany("");
		}
		else {
			computerImpl.setCompany(company);
		}

		if (modelName == null) {
			computerImpl.setModelName("");
		}
		else {
			computerImpl.setModelName(modelName);
		}

		if (operatingSystem == null) {
			computerImpl.setOperatingSystem("");
		}
		else {
			computerImpl.setOperatingSystem(operatingSystem);
		}

		computerImpl.setCost(cost);
		computerImpl.setRating(rating);

		computerImpl.resetOriginalValues();

		return computerImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		computerId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		company = objectInput.readUTF();
		modelName = objectInput.readUTF();
		operatingSystem = objectInput.readUTF();

		cost = objectInput.readDouble();

		rating = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(computerId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (company == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(company);
		}

		if (modelName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(modelName);
		}

		if (operatingSystem == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(operatingSystem);
		}

		objectOutput.writeDouble(cost);

		objectOutput.writeInt(rating);
	}

	public String uuid;
	public long computerId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String company;
	public String modelName;
	public String operatingSystem;
	public double cost;
	public int rating;
}