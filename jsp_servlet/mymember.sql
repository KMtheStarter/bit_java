create table mymember(
num number constraint mymember_num_pk primary key,
id varchar2(10) constraint mymember_id_nn not null,
pwd varchar2(10),
name varchar2(20),
edate date,
constraint mymember_id_uq unique(id)
);

create sequence mymember_seq increment by 1 start with 1;

select * from mymember;

commit;

