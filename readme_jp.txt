starjavapos_windows
Ver 1.13.12
---------------------------------------

���̃t�@�C���ł́A�}�j���A��(starjavapos_sm_jp.pdf)�ɋL�ڂ���Ă��Ȃ�
�����ɂ��ĕ⑫�����Ē����܂��B


�t�@�C������уt�H���_�\���F
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


Java���s���F
    Java2 Standard Edition 1.4.2�ȍ~

    �� Java2 Standard Edition 5.0�𐄏����܂��B


�R���t�B�O���[�V�����T���v�� - jpos.xml�F
    Star JavaPOS�h���C�o�́A�f�o�C�X�R���g���[����Star JavaPOS
    �f�o�C�X�T�[�r�X��ڑ����邽�߂ɁAJCL(JavaPOS Configuration /
    Loader)���g�p���܂��Bjpos.xml�t�@�C���ɂ́AStar POS�v�����^��
    �ڑ����邽�߂̃T���v�����L�q����Ă��܂��B

    �ȉ��́APOSPrinter�G���g���̐ݒ�჊�X�g�ł��B
        . POSPrinter_windows_parallel
        . POSPrinter_windows_serial
        . POSPrinter_windows_usb_printer_class
        . POSPrinter_windows_usb_vendor_class
        . POSPrinter_windows_ethernet
        . POSPrinter_windows_bluetooth

    �ȉ��́ACashDrawer�G���g���̐ݒ�჊�X�g�ł��B
        . CashDrawer_windows_parallel
        . CashDrawer_windows_serial
        . CashDrawer_windows_usb_printer_class
        . CashDrawer_windows_usb_vendor_class
        . CashDrawer_windows_ethernet
        . CashDrawer_windows_bluetooth

    �ȉ���POSPrinter�̒ǉ��v���p�e�B�ł��B
        . useNVLogoImage
        �L�q��F    <prop name="useNVBitImage" type="Boolean" value="true" />
    �� useNVLogoImage�v���p�e�B��true�ɐݒ肷�邱�ƂŁA�G�X�P�[�v�V�[�P���X"ESC | # B (#�͐���)"�ɂ�NV���S������o���܂��B

    �ݒ�̏ڍׂ́Astarjavapos_sm_jp.pdf�����Q�Ƃ��������B



�g�p��F
    StarReceiptTest.java�AStarCashDrawerTest.java�����Q�Ƃ��������B


�����[�X����

2006/12/27 "portName"��"portSettings"�����L�h���C�o����ύX�B
Ver 1.9.6  starjavapos_win32-linux-macosx_20051101.zip

2007/03/17 �@��ǉ��FTSP700II
Ver 1.9.7

2007/07/17 �@��ǉ��FTSP650
Ver 1.9.8

2008/12/12 �@��ǉ��FTUP500
Ver 1.9.13

2010/12/28 �@��ǉ��FFVP10�ATSP800II�B
Ver 1.13.0 JavaPOS Ver. 1.13.0�����B

2011/04/18 2�o�C�g�����ɑΉ��B
Ver 1.13.1

2011/05/31 Bug-fix release
Ver 1.13.2 �S�@��FText�݂̂̓|���󎚂��ł��Ȃ��s��̏C��
           TSP100�V���[�Y�F1�s�����̃f�[�^�𑗐M����ƃG���[���o�͂����s��̏C��

2012/06/29 Bug-fix release
Ver 1.13.3 �S�@��:�񓯊����s���AclearOutput()�ŃG���[���o�͂����s��̏C��
                  clearoutPut()���s���A�|���󎚋y�уg�����U�N�V�����󎚂���������Ȃ��s��̏C��
                  �G�X�P�[�v�V�[�P���X�ɂ�郍�S�����rotatePrint()�����f����Ȃ��s��̏C��
                  setLogo()�ɃG�X�P�[�v�V�[�P���X�ɂ��g�b�v�y�у{�g�����S������܂߂��Ƃ��󎚂���s��̏C��
                  �o�[�R�[�h�󎚂ɂ����āA�󎚗̈�𒴂���Alignment�̎w�肪�ł���s��̏C��
                  �G�X�P�[�v�V�[�P���X�ɂ��m�u���S�󎚂̋@�\�ǉ�

2012/11/22 �@��ǉ��FTSP650II�AI/F�ǉ��FBluetooth
Ver 1.13.4

2013/10/30 stario.jar �p�b�P�[�W�\���ύX
Ver 1.13.5

2013/11/27 �@��ǉ��FSAC10EBi�ASAC10E (�L���b�V���h�����[�C���^�[�t�F�C�XBOX)
Ver 1.13.6 SAC10E��IP�A�h���X���������邽�߂�DiscoveryTool��ǉ�
           Bluetooth�y��USB�x���_�N���XI/F�ɂ����Ĉ󎚒��ɓd����Off�ɂ�����A�ēx�d����
           on�ɂ��Ă����한�A���Ȃ��s��̏C��

2014/06/09 Bluetooth�Ή��@��ǉ�:TSP700II, TSP800II
Ver 1.13.7

2015/01/26 Bluetooth�Ή��@��ǉ�:FVP10
Ver 1.13.8

2015/12/17 Microsoft Windows 10 32bit/64bit �Ή�
Ver 1.13.9   Mobile Edition, IoT Edition������

2016/06/27 2�����o�[�R�[�h�Ή�
Ver1.13.10  - PDF417, QR code
           �f�t�H���g�R�[�h�y�[�W�ύX�v���p�e�B��ǉ�

2019/04/09 Bluetooth Mac�A�h���X�ɂ��|�[�g�w��ɑΉ�
Ver1.13.11 �o�O�C��:������CashDrawer�f�o�C�X�𓯎��ɐ���������ł��Ȃ������C��

2019/12/25 �@�\�ǉ�:jpos.xml��imageBinarizationThreshold�v���p�e�B��ǉ�
ver1.13.12          �摜�̈󎚑��x�����P (printBitmap, setBitmap)
           �o�O�C��:���̃v�����^�[�̕����f�o�C�X�N���X(POSPrinter, Drawer)�ɑ΂��A
                    deviceEnabled�v���p�e�B�𓯎���true�ɐݒ�ł��Ȃ������C��
           �T�|�[�g�I���@��:TSP113, TSP113GT, TSP113LAN, SAC10
