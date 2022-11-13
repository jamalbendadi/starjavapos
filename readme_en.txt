starjavapos_windows
Ver 1.13.12
---------------------------------------

Package Contents:
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


Java Virtual Machine Requirement:
    Java2 Standard Edition 1.4.2 or higher

    NOTE: We recommend using Java2 Standard Edition 5.0 or higher


Configuration Sample - jpos.xml:
    StarJavaPOS uses the JCL - Java Configuration Loader system for
    configuring the provided services.  The file jpos.xml contained
    in this package has been initialized with device entries for
    Star's newest printer products.

    The following is a list of the POSPrinter device entries
    contained in this file as indexed by their logicalName field:
        . POSPrinter_windows_parallel
        . POSPrinter_windows_serial
        . POSPrinter_windows_usb_printer_class
        . POSPrinter_windows_usb_vendor_class
        . POSPrinter_windows_ethernet
        . POSPrinter_windows_bluetooth

    The following is a list of the DotMatrixPrinter device entries
    contained in this file as indexed by their logicalName field:
        . DotMatrixPrinter_windows_bluetooth
    NOTE: The DotMatrixPrinter of the jpos.xml settings is 
          same as the POSPrinter device entries.

    The following is a list of the CashDrawer device entries
    contained in this file as indexed by their logicalName field:
        . CashDrawer_windows_parallel
        . CashDrawer_windows_serial
        . CashDrawer_windows_usb_printer_class
        . CashDrawer_windows_usb_vendor_class
        . CashDrawer_windows_ethernet
        . CashDrawer_windows_bluetooth

    The following is a list of the MICR device entries
    contained in this file as indexed by their logicalName field:
        . HSP7000_MICR_windows_parallel
        . HSP7000_MICR_windows_serial
        . HSP7000_MICR_windows_usb_vendor_class
        . HSP7000_MICR_windows_ethernet
    NOTE: The HSP7000's MICR function is not supported in USB
          Printer Class Mode.

    The following is an adding property of POSPrinter
        . useNVBitImage
        example:  <prop name="useNVBitImage" type="Boolean" value="true" />
    NOTE: If "useNVLogoImage property" set the "true", can use "NV Logo Print" by escape sequence(ESC | # B). 


    Please refer to starjavapos_sm_en.pdf for details.


Usage - Test Application:
    Open StarReceiptTest.java, StarSlipTest.java,
    StarCashDrawerTest.java and StarMICRTest.java.
    Then, refer to the usage instructions.


Release History

12/27/2006 Changed portSettings field value of serial port from
Ver 1.9.6  starjavapos_win32-linux-macosx_20051101.zip

           Changed portName field value from
           starjavapos_win32-linux-macosx_20051101.zip

03/17/2007 Added TSP700II
Ver 1.9.7

07/17/2007 Added TSP651/654
Ver 1.9.8

04/25/2008 Added HSP7000
Ver 1.9.11

07/23/2008 Added HSP7000 MICR
Ver 1.9.12

12/12/2008 Added TUP500
Ver 1.9.13

12/28/2010 Added FVP10, TSP800II, SP500,
Ver 1.13.0 JavaPOS Ver. 1.13.0

04/18/2011 Support DBCS
Ver 1.13.1

05/31/2011 Bug-fix release
Ver 1.13.2 All models:
            Debug 180 degree rotation command
            When set 180 rotation, cannot set rotation if data is only text.
           TSP100 series:
            Debug error output bug
            When JavaPOS driver receives less than one line data,
            JavaPOS driver output "NullPointerException".

06/29/2012 Bug-fix release
Ver 1.13.3 All models:
            Debug following clearOutput() issues. 
                When set asyncMode, cannot perform clearOutput().
                When perform clearOutput(), cannot release tranzactionPrint() and rotatePrint().
            Debug following setLogo issue
                When perform setLogo(), can set top or bottom logo by escape sequence.
            Debug following barcode print issue
                can set alignment which is over printableArea.
            Added a function of "NV Logo Print" by escape sequence.

11/22/2012 Added TSP650II, Bluetooth I/F
Ver 1.13.4

10/30/2013 Modified the configuration of package in stario.jar. 
Ver 1.13.5

11/27/2013 Added SAC10EBi, SAC10E (CashDrawer Interface BOX)
Ver 1.13.6 Added DiscoveryTool to get the IP Address of SAC10E
           Modified issue about the Bluetooth and USB Vendor Class I/F 
           which is not to return normally status,
           even if turn on a power supply again after turning off power supply during printing.

06/09/2014 Added models support Bluetooth interface newly.
Ver 1.13.7 TSP700II, TSP800II, SP700(only SP742).   

01/26/2015 Added models support Bluetooth interface newly.
Ver 1.13.8 FVP10.

12/17/2015 Added support Microsoft Windows 10 32bit/64bit
Ver 1.13.9 - Mobile Edition and IoT Edition are not supported.

06/27/2016 Added support 2-dimensional bar code (PDF417, QR code)
Ver1.13.10  - PDF417, QR code
           Added property to change the default codepage (jpos.xml)

04/09/2019 Added support port specification by Bluetooth Mac address
ver1.13.11 Bug Fix:cannot control multiple CashDrawer devices simultaneously.

12/25/2019 New function: Added imageBinarizationThreshold property to jpos.xml.
ver1.13.12               Improved printing speed (printBitmap, setBitmap).
           Bug Fix: cannot set the 'deviceEnabled' properties of one printer's device class(POSPrinter, Drawer) 
                    to 'true' simultaneously.
           End Support: TSP113, TSP113GT, TSP113LAN, SAC10
