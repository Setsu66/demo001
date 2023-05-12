package com.xls.demo2.Controller;

import com.xls.demo2.entity.Build;
import com.xls.demo2.service.UserBuildService;
import com.xls.demo2.service.impl.UserBuildImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Build")
public class UserbuildController {
    @Autowired
    private UserBuildImpl userbuildImpl;
    @PostMapping("build")     //设置方法的请求路径　メソッドのポストパスの設定
    public ResponseEntity<?> createBuilding(@RequestBody Build build) {


        if (build.getDbHisaijutakuShurui() == null || build.getDbHisaijutakuShurui().isEmpty()) {
            return ResponseEntity.badRequest().body("被災住宅の種類を選択してください。");
        }
        if (build.getDbHisaijutakuShoyuu() == null || build.getDbHisaijutakuShoyuu().isEmpty()) {
            return ResponseEntity.badRequest().body("被災住宅の所有を選択してください。");
        }
        if (build.getDbHigaiJokyo() == null || build.getDbHigaiJokyo().isEmpty()) {
            return ResponseEntity.badRequest().body("被害状況を選択してください。");
        }
        if (build.getDbBukken_Menseki() == null || build.getDbBukken_Menseki().isEmpty()) {
            return ResponseEntity.badRequest().body("敷地の面積を入力してください。");
        }
        if (build.getAplBukkenAddressTodofuken() == null || build.getAplBukkenAddressTodofuken().isEmpty()) {
            return ResponseEntity.badRequest().body("物件_敷地（所在地）_都道府県を選択してください。");
        }
        if (build.getAplBukkenAddressPostCode3() == null || build.getAplBukkenAddressPostCode3().isEmpty()) {
            return ResponseEntity.badRequest().body("物件_敷地（所在地）_郵便番号を入力してください。");
        }
        if (build.getDbBukkenShikichiNoShoyuKankei() == null || build.getDbBukkenShikichiNoShoyuKankei().isEmpty()) {
            return ResponseEntity.badRequest().body("敷地の所有関係を選択してください。");
        }
        if (build.getDbBukken_Tatemono_Jutaku() == null || build.getDbBukken_Tatemono_Jutaku().isEmpty()) {
            return ResponseEntity.badRequest().body("建物の床面積_住宅部分を入力してください。");
        }
        if (build.getDbBukken_Tatemono_HiJutaku() == null|| build.getDbBukken_Tatemono_HiJutaku().isEmpty() ) {
            return ResponseEntity.badRequest().body("建物の床面積_非住宅部分を入力してください。");
        }
        if (build.getDbBukken_Kozo() == null || build.getDbBukken_Kozo().isEmpty()) {
            return ResponseEntity.badRequest().body("建物の構造（戸建形式）を選択してください。");
        }
        if (build.getDbBukken_TatekataKodateKeishiki() == null || build.getDbBukken_TatekataKodateKeishiki().isEmpty()) {
            return ResponseEntity.badRequest().body("建て方を選択してください。");
        }
        if (build.getDbNyukyoYoteiDateYear() == null || build.getDbNyukyoYoteiDateYear().isEmpty()) {
            return ResponseEntity.badRequest().body("入居予定年（年を選択してください。");
        }
        if (build.getDbNyukyoYoteiDateMonth() == null || build.getDbNyukyoYoteiDateMonth().isEmpty()) {
            return ResponseEntity.badRequest().body("入居予定月（月）を選択してください。");
        }
        if (build.getDbJutakuYoto() == null || build.getDbJutakuYoto().isEmpty()) {
            return ResponseEntity.badRequest().body("住宅の用途を選択してください。");
        }
        if (build.getDbBukken_KojiKanryoDate_Year() == null || build.getDbBukken_KojiKanryoDate_Year().isEmpty()) {
            return ResponseEntity.badRequest().body("物件_工事完了予定年月_年を選択してください。");
        }
        if (build.getDbBukken_KojiKanryoDate_Month() == null || build.getDbBukken_KojiKanryoDate_Month().isEmpty()) {
            return ResponseEntity.badRequest().body("物件_工事完了予定年月_月を選択してください。");
        }
        if (build.getDbShikinDateSaishuShikinYear() == null || build.getDbShikinDateSaishuShikinYear().isEmpty()) {
            return ResponseEntity.badRequest().body("資金の受取予定年月_最終資金_年を選択してください。");
        }
        if (build.getDbShikinDateSaishuShikinMonth() == null || build.getDbShikinDateSaishuShikinMonth().isEmpty()) {
            return ResponseEntity.badRequest().body("資金の受取予定年月_最終資金_月を選択してください。");
        }
        if (build.getDbKariireIninKaishaName() == null || build.getDbKariireIninKaishaName().isEmpty()) {
            return ResponseEntity.badRequest().body("会社名称を入力してください。");
        }
        if (build.getDbChukaiHanbaiTantoshaNameSei() == null || build.getDbChukaiHanbaiTantoshaNameSei().isEmpty()) {
            return ResponseEntity.badRequest().body("仲介業者又は販売代理_担当者名_姓を入力してください。");
        }
        if (build.getDbChukaiHanbaiTantoshaNameMei() == null || build.getDbChukaiHanbaiTantoshaNameMei().isEmpty()) {
            return ResponseEntity.badRequest().body("仲介業者又は販売代理_担当者名_名を入力してください。");
        }
        if (build.getDbHiyouKensetsuHi() == null || build.getDbHiyouKensetsuHi().isEmpty()) {
            return ResponseEntity.badRequest().body("建設費を入力してください。");
        }
        if (build.getDbHiyouTochiSyotokuHi() == null || build.getDbHiyouTochiSyotokuHi().isEmpty()) {
            return ResponseEntity.badRequest().body("土地取得費を入力してください。");
        }
        if (build.getDbHiyouTotal() == null || build.getDbHiyouTotal().isEmpty()) {
            return ResponseEntity.badRequest().body("費用合計を入力してください。");
        }
        if (build.getDbKariireGakuKingaku() == null || build.getDbKariireGakuKingaku().isEmpty()) {
            return ResponseEntity.badRequest().body("借入希望額_借入金額を入力してください。");
        }
        if (build.getDbKariireGakuKinri() == null || build.getDbKariireGakuKinri().isEmpty()) {
            return ResponseEntity.badRequest().body("借入希望額_金利を入力してください。");
        }
        if (build.getDbKariireGakuHensaiKikan() == null || build.getDbKariireGakuHensaiKikan().isEmpty()) {
            return ResponseEntity.badRequest().body("借入希望額_返済期間を入力してください。");
        }
        if (build.getDbKariireGakuNenHensai12No1() == null|| build.getDbKariireGakuNenHensai12No1().isEmpty() ) {
            return ResponseEntity.badRequest().body("借入希望額_年間返済額の1/12を入力してください。");
        }
        if (build.getDbHensaiHouhou() == null || build.getDbHensaiHouhou().isEmpty()) {
            return ResponseEntity.badRequest().body("返済方法を選択してください。");
        }
        if (build.getDbHisaiShinzokuDokyoAri() == null || build.getDbHisaiShinzokuDokyoAri().isEmpty()) {
            return ResponseEntity.badRequest().body("被災親族同居の有無を選択してください。");
        }
        if (build.getDbSueokiKikanNoNensu() == null || build.getDbSueokiKikanNoNensu().isEmpty()) {
            return ResponseEntity.badRequest().body("据置期間の年数を選択してください。");
        }



        userbuildImpl.save(build);

        return ResponseEntity.ok("保存成功");
    }
}
