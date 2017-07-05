SUMMARY = "Widgets for Baloo"
LICENSE = "LGPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING.README;md5=f5d7c5af660f94231a1d4e19501bce8f \
    file://COPYING.LIB;md5=4fbd65380cdd255951079008b364516c \
"

inherit kde-apps gettext

DEPENDS += "\
    kauth-native \
    kconfig-native \
    kcoreaddons-native \
    kio \
    ki18n \
    kservice \
    kfilemetadata \
    baloo \
    kdelibs4support \
"

PV = "${KDE_APP_VERSION}"
SRC_URI[md5sum] = "367c46f828619e8c72c5f15d5d39ce52"
SRC_URI[sha256sum] = "e921466c85b8688a24aa71b366e368573bd8cf79e9036cf7e5f6fd516cc157bb"
