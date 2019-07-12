create table bbs(
    num number(5) constraint bbs_num_pk primary key,
    sub varchar2(100),
    write varchar2(34),
    pwd varchar2(10),
    cont varchar2(400),
    hit number(3),
    reip varchar2(34),
    redate date);
    
create sequence bbs_seq
increment by 1
start with 1;

select * from bbs;

insert into bbs values (bbs_seq.nextVal, 'test', 'test', 'test', 'test', 0, 'test', sysdate);
commit;

select * from (
    select rownum r_num, a.* from (
        select * from bbs order by num desc
        ) a
    ) where r_num between #{begin} and #{end};

select * from (
    select rownum r_num, a.* from (
        select * from bbs order by num desc
        ) a
    ) where r_num between 1 and 10;