SUMMARY = "Kdenlive is an intuitive and powerful multi-track video editor"
LICENSE = "GPL-2.0"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=38adfe5a9f2953129da1774430b28adf \
"

inherit kde-apps gtk-icon-cache mime mime-xdg

DEPENDS += "\
    shared-mime-info-native \
    kpackage-native \
    kcoreaddons-native \
    kdoctools-native \
    kauth-native \
    mlt \
    qtsvg \
    qtwebengine \
    qtnetworkauth \
    karchive \
    sonnet-native \
    kbookmarks \
    kconfig-native \
    kconfigwidgets \
    kdbusaddons \
    kfilemetadata \
    kio \
    kwidgetsaddons \
    kplotting \
    knotifyconfig \
    knewstuff \
    kxmlgui \
    knotifications \
    kguiaddons \
    ktextwidgets \
    kiconthemes \
    xapian-core \
    purpose \
    kdeclarative \
    v4l-utils \
"

PV = "${KDE_APP_VERSION}"
SRC_URI += "file://0001-CMakeLists.txt-make-MLT_PREFIX-configurable.patch"
SRC_URI[sha256sum] = "f59c3749f1432cf04151a657a7e345ac45f76e75dbc7a3d411b31dd93430a183"

EXTRA_OECMAKE += " \
    -DMLT_PREFIX=${prefix} \
    -DBUILD_TESTING=OFF \
"

FILES:${PN} += " \
    ${datadir}/config.kcfg \
    ${datadir}/icons \
    ${datadir}/k*5 \
    ${datadir}/knsrcfiles \
    ${datadir}/mime \
    ${datadir}/menu \
    ${OE_QMAKE_PATH_PLUGINS} \
"

RRECOMMENDS:${PN} += "ffmpeg"
