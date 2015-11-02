

-------------------------------------------------------------------------------
--  task def operation
-------------------------------------------------------------------------------
CREATE TABLE TASK_DEF_OPERATION(
	ID BIGINT GENERATED BY DEFAULT AS IDENTITY(START WITH 1) NOT NULL,
	VALUE VARCHAR(200),
	TYPE VARCHAR(50),
	STATUS VARCHAR(50),
	PRIORITY INT,
	BASE_ID BIGINT,
        CONSTRAINT PK_TASK_DEF_OPERATION PRIMARY KEY(ID),
        CONSTRAINT FK_TASK_DEF_OPERATION_BASE FOREIGN KEY(BASE_ID) REFERENCES TASK_DEF_BASE(ID)
);


