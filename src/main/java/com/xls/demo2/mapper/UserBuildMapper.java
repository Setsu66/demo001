package com.xls.demo2.mapper;


import com.xls.demo2.entity.Build;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public
interface UserBuildMapper {
    @Insert(
            "INSERT INTO Building(" +
                    "dbHisaijutakuShurui," +
                    "dbHisaijutakuShoyuu," +
                    "dbHigaiJokyo," +
                    "dbHigaiJokyoDaikiboHankaiOrHankai," +
                    "dbBukken_Menseki," +
                    "aplBukkenAddressTodofuken," +
                    "dbBukkenAddressShigun," +
                    "dbBukkenAddressChoson," +
                    "aplBukkenAddressBanchi," +
                    "aplBukkenAddressPostCode3," +
                    "dbBousaiSyudanItenJigyo," +
                    "dbBukkenShikichiNoShoyuKankei," +
                    "dbBukken_Tatemono_Jutaku," +
                    "dbBukken_Tatemono_HiJutaku," +
                    "dbBukken_Kozo," +
                    "dbBukken_TatekataKodateKeishiki," +
                    "dbNyukyoYoteiDateYear," +
                    "dbNyukyoYoteiDateMonth," +
                    "dbJutakuYoto," +
                    "dbBukken_KojiKanryoDate_Year," +
                    "dbBukken_KojiKanryoDate_Month," +
                    "dbShikinDateTochiShikinYear," +
                    "dbShikinDateTochiShikinMonth," +
                    "dbShikinDateChukanShikinYear," +
                    "dbShikinDateChukanShikinMonth," +
                    "dbShikinDateSaishuShikinYear," +
                    "dbShikinDateSaishuShikinMonth," +
                    "dbKariireIninKaishaName," +
                    "dbChukaiHanbaiNameKana," +
                    "dbChukaiHanbaiTantoshaNameSei," +
                    "dbChukaiHanbaiTantoshaNameMei," +
                    "dbHiyouKensetsuHi," +
                    "dbHiyouTochiSyotokuHi," +
                    "dbHiyouTotal," +
                    "dbHensaiHouhou," +
                    "dbHisaiShinzokuDokyoAri," +
                    "dbSueokiKikanNoNensu," +
                    "dbKariireGakuKingaku," +
                    "dbKariireGakuKinri," +
                    "dbKariireGakuHensaiKikan," +
                    "dbKariireGakuNenHensai12No1," +
                    "dbSonotaName," +
                    "dbSonotaKingaku," +
                    "dbSonotaHensaiKikan," +
                    "dbSonotaNenHensai12No1," +
                    "dbSogoKingaku," +
                    "dbKinyuKikanName," +
                    "dbShitemName)" +
                    "VALUES(" +
                    "#{dbHisaijutakuShurui}," +
                    "#{dbHisaijutakuShoyuu}," +
                    "#{dbHigaiJokyo}," +
                    "#{dbHigaiJokyoDaikiboHankaiOrHankai}," +
                    "#{dbBukken_Menseki}," +
                    "#{aplBukkenAddressTodofuken}," +
                    "#{dbBukkenAddressShigun}," +
                    "#{dbBukkenAddressChoson}," +
                    "#{aplBukkenAddressBanchi}," +
                    "#{aplBukkenAddressPostCode3}," +
                    "#{dbBousaiSyudanItenJigyo}," +
                    "#{dbBukkenShikichiNoShoyuKankei}," +
                    "#{dbBukken_Tatemono_Jutaku}," +
                    "#{dbBukken_Tatemono_HiJutaku}," +
                    "#{dbBukken_Kozo}," +
                    "#{dbBukken_TatekataKodateKeishiki}," +
                    "#{dbNyukyoYoteiDateYear}," +
                    "#{dbNyukyoYoteiDateMonth}," +
                    "#{dbJutakuYoto}," +
                    "#{dbBukken_KojiKanryoDate_Year}," +
                    "#{dbBukken_KojiKanryoDate_Month}," +
                    "#{dbShikinDateTochiShikinYear}," +
                    "#{dbShikinDateTochiShikinMonth}," +
                    "#{dbShikinDateChukanShikinYear}," +
                    "#{dbShikinDateChukanShikinMonth}," +
                    "#{dbShikinDateSaishuShikinYear }," +
                    "#{dbShikinDateSaishuShikinMonth}," +
                    "#{dbKariireIninKaishaName}," +
                    "#{dbChukaiHanbaiNameKana}," +
                    "#{dbChukaiHanbaiTantoshaNameSei}," +
                    "#{dbChukaiHanbaiTantoshaNameMei}," +
                    "#{dbHiyouKensetsuHi}," +
                    "#{dbHiyouTochiSyotokuHi}," +
                    "#{dbHiyouTotal}," +
                    "#{dbHensaiHouhou}," +
                    "#{dbHisaiShinzokuDokyoAri}," +
                    "#{dbSueokiKikanNoNensu}," +
                    "#{dbKariireGakuKingaku}," +
                    "#{dbKariireGakuKinri}," +
                    "#{dbKariireGakuHensaiKikan}," +
                    "#{dbKariireGakuNenHensai12No1}," +
                    "#{dbSonotaName}," +
                    "#{dbSonotaKingaku}," +
                    "#{dbSonotaHensaiKikan}," +
                    "#{dbSonotaNenHensai12No1}," +
                    "#{dbSogoKingaku}," +
                    "#{dbKinyuKikanName}," +
                    "#{dbShitemName})")
     Void insert(Build build);
}