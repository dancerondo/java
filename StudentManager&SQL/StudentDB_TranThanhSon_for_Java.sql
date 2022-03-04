CREATE DATABASE StudentDB_TranThanhSon;
use StudentDB_TranThanhSon;
GO
-- Tao bang Accounts
CREATE TABLE Accounts(
	Code nvarchar(50),
	username nchar(50),
	passwords nchar(50),
	CONSTRAINT Accounts_PK PRIMARY KEY (Code)
);
--Tao bang Student
CREATE TABLE Student(
	StudentID  nchar(50),
	StudentName nvarchar(50),
	DateOfBirth date,
	PhoneNumber int,
	CONSTRAINT Student_PK PRIMARY KEY(StudentID),
);
--Tao bang Subject
CREATE TABLE Subjects(
	SubjectCode nchar(50),
	SubjectName nvarchar(50),
	CONSTRAINT Subject_PK PRIMARY KEY(SubjectCode),
);
--Tao bang Scores
CREATE TABLE Scores(
	StudentCode nchar(50),
	SubjectCode nchar(50),
	score float,
	CONSTRAINT Scores_PK PRIMARY KEY (StudentCode,SubjectCode),
	CONSTRAINT Scores_FK_Student FOREIGN KEY(StudentCode) REFERENCES Student (StudentID),
	CONSTRAINT Scores_FK_Subject FOREIGN KEY(SubjectCode) REFERENCES Subjects (SubjectCode),
);
--Tao bang ranking
CREATE TABLE Ranking(
	StudentID nchar(50),
	averageScore decimal(4,2),
	Ranking nvarchar(50),
	CONSTRAINT Ranking_FK_Student FOREIGN KEY (StudentID) REFERENCES Student (StudentID),
	CONSTRAINT Ranking_PK PRIMARY KEY(StudentID)
);
--Chen du lieu vao cac bang
--Chen du lieu vao bang Account
INSERT INTO Accounts VALUES ('acc01','dancerondo','123456')
INSERT INTO Accounts VALUES('acc02','sontran','abc123')
--Chen du lieu vao bang Student
INSERT INTO Student VALUES ('std01','Nguyen Van A','2000-01-01',0905123456)
INSERT INTO Student VALUES ('std02','Nguyen Van B','2001-01-01',0905456789)
INSERT INTO Student VALUES('std03','Nguyen Van C','2002-01-01',0913666777)
--Chen du lieu vao bang Subject
INSERT INTO Subjects VALUES('Sj01','XML')
INSERT INTO Subjects VALUES('Sj02','Java 1')
INSERT INTO Subjects VALUES('Sj03','Java 2')
--Chen du lieu vao bang Scores
INSERT INTO Scores VALUES('std01','Sj01',6.0)
INSERT INTO Scores VALUES('std01','Sj02',6.5)
INSERT INTO Scores VALUES('std01','Sj03',7.0)
INSERT INTO Scores VALUES('std02','Sj01',4.0)
INSERT INTO Scores VALUES('std02','Sj02',3.0)
INSERT INTO Scores VALUES('std02','Sj03',9.0)
INSERT INTO Scores VALUES('std03','Sj01',10.0)
INSERT INTO Scores VALUES('std03','Sj02',8.8)
INSERT INTO Scores VALUES('sdt03','Sj03',9.0)
--Chen du lieu vao bang ranking
INSERT INTO Ranking VALUES ('std01',6.5,'pass')
INSERT INTO Ranking VALUES('std02',5.3,'pass')
INSERT INTO Ranking VALUES('std03',9.3,'pass')

SELECT * FROM Accounts
SELECT username,passwords FROM Accounts
DELETE FROM Accounts WHERE Code = 'acc01'
--CHECK

SELECT * FROM Student 
SELECT * FROM Scores
SELECT * FROM Ranking
