package com.xls.demo2.mapper;


import com.xls.demo2.entity.Tanpo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserTanpoMapper {


    @Insert("INSERT INTO user2" +
            "(tanpomono,xing,ming,sei,mei,birth,age,moushikomi,rentai,sex,job,address,reason,phone)" +
            " VALUES" +
            "(#{tanpomono},#{xing},#{ming},#{sei},#{mei},#{birth},#{age},#{moushikomi},#{rentai}," +
            "#{sex},#{job},#{address},#{reason},#{phone})")

    void insert(Tanpo tanpo);
}
