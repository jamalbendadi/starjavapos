starjavapos_windows
Ver 1.13.12
---------------------------------------

このファイルでは、マニュアル(starjavapos_sm_jp.pdf)に記載されていない
事項について補足させて頂きます。


ファイルおよびフォルダ構成：
    . starjavapos.jar
    . stario.jar
    . CommandEmulator.jar
    . jpos113-controls.jar
    . jcl.jar
    . xercesimpl.jar
    . xml-apis.jar
    . jpos.xml
    . StarReceiptTest.java
    . StarSlipTest.java
    . StarCashDrawerTest.java
    . StarMICRTest.java
    . star.gif
    . StarIOJ.dll
    . StarIOPort.dll
    . SoftwareLicenseAgreement.pdf
    . SoftwareLicenseAgreement_jp.pdf
    . SoftwareLicenseAgreementAppendix.pdf
    . readme_en.txt
    . readme_jp.txt
    . USBVendorClassDriver
    . DiscoveryTool


Java実行環境：
    Java2 Standard Edition 1.4.2以降

    ※ Java2 Standard Edition 5.0を推奨します。


コンフィグレーションサンプル - jpos.xml：
    Star JavaPOSドライバは、デバイスコントロールとStar JavaPOS
    デバイスサービスを接続するために、JCL(JavaPOS Configuration /
    Loader)を使用します。jpos.xmlファイルには、Star POSプリンタと
    接続するためのサンプルが記述されています。

    以下は、POSPrinterエントリの設定例リストです。
        . POSPrinter_windows_parallel
        . POSPrinter_windows_serial
        . POSPrinter_windows_usb_printer_class
        . POSPrinter_windows_usb_vendor_class
        . POSPrinter_windows_ethernet
        . POSPrinter_windows_bluetooth

    以下は、CashDrawerエントリの設定例リストです。
        . CashDrawer_windows_parallel
        . CashDrawer_windows_serial
        . CashDrawer_windows_usb_printer_class
        . CashDrawer_windows_usb_vendor_class
        . CashDrawer_windows_ethernet
        . CashDrawer_windows_bluetooth

    以下はPOSPrinterの追加プロパティです。
        . useNVLogoImage
        記述例：    <prop name="useNVBitImage" type="Boolean" value="true" />
    ※ useNVLogoImageプロパティをtrueに設定することで、エスケープシーケンス"ESC | # B (#は数字)"にてNVロゴ印刷が出来ます。

    設定の詳細は、starjavapos_sm_jp.pdfをご参照ください。



使用例：
    StarReceiptTest.java、StarCashDrawerTest.javaをご参照ください。


リリース履歴

2006/12/27 "portName"と"portSettings"を下記ドライバから変更。
Ver 1.9.6  starjavapos_win32-linux-macosx_20051101.zip

2007/03/17 機種追加：TSP700II
Ver 1.9.7

2007/07/17 機種追加：TSP650
Ver 1.9.8

2008/12/12 機種追加：TUP500
Ver 1.9.13

2010/12/28 機種追加：FVP10、TSP800II。
Ver 1.13.0 JavaPOS Ver. 1.13.0準拠。

2011/04/18 2バイト文字に対応。
Ver 1.13.1

2011/05/31 Bug-fix release
Ver 1.13.2 全機種：Textのみの倒立印字ができない不具合の修正
           TSP100シリーズ：1行未満のデータを送信するとエラーが出力される不具合の修正

2012/06/29 Bug-fix release
Ver 1.13.3 全機種:非同期実行時、clearOutput()でエラーが出力される不具合の修正
                  clearoutPut()実行時、倒立印字及びトランザクション印字が解除されない不具合の修正
                  エスケープシーケンスによるロゴ印刷でrotatePrint()が反映されない不具合の修正
                  setLogo()にエスケープシーケンスによるトップ及びボトムロゴ印刷を含めたとき印字する不具合の修正
                  バーコード印字において、印字領域を超えるAlignmentの指定ができる不具合の修正
                  エスケープシーケンスによるＮＶロゴ印字の機能追加

2012/11/22 機種追加：TSP650II、I/F追加：Bluetooth
Ver 1.13.4

2013/10/30 stario.jar パッケージ構成変更
Ver 1.13.5

2013/11/27 機種追加：SAC10EBi、SAC10E (キャッシュドロワーインターフェイスBOX)
Ver 1.13.6 SAC10EのIPアドレスを検索するためのDiscoveryToolを追加
           Bluetooth及びUSBベンダクラスI/Fにおいて印字中に電源をOffにした後、再度電源を
           onにしても正常復帰しない不具合の修正

2014/06/09 Bluetooth対応機種追加:TSP700II, TSP800II
Ver 1.13.7

2015/01/26 Bluetooth対応機種追加:FVP10
Ver 1.13.8

2015/12/17 Microsoft Windows 10 32bit/64bit 対応
Ver 1.13.9   Mobile Edition, IoT Editionを除く

2016/06/27 2次元バーコード対応
Ver1.13.10  - PDF417, QR code
           デフォルトコードページ変更プロパティを追加

2019/04/09 Bluetooth Macアドレスによるポート指定に対応
Ver1.13.11 バグ修正:複数のCashDrawerデバイスを同時に正しく制御できない問題を修正

2019/12/25 機能追加:jpos.xmlにimageBinarizationThresholdプロパティを追加
ver1.13.12          画像の印字速度を改善 (printBitmap, setBitmap)
           バグ修正:一台のプリンターの複数デバイスクラス(POSPrinter, Drawer)に対し、
                    deviceEnabledプロパティを同時にtrueに設定できない問題を修正
           サポート終了機種:TSP113, TSP113GT, TSP113LAN, SAC10
