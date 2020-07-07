create table CMP_Computer (
	uuid_ VARCHAR(75) null,
	computerId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	company VARCHAR(75) null,
	modelName VARCHAR(75) null,
	operatingSystem VARCHAR(75) null,
	cost DOUBLE,
	rating INTEGER
);