SUMMARY = "Libkdcraw is a C++ interface around LibRaw library"
LICENSE = "GPL-2.0 & BSD-3-Clause & LGPL-2.0"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=7974e16b472f00bbbadf2d006aa00c50 \
    file://COPYING-CMAKE-SCRIPTS;md5=54c7042be62e169199200bc6477f04d1 \
    file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-apps

DEPENDS += "\
    libraw \
" 

PV = "${KDE_APP_VERSION}"
SRC_URI[sha256sum] = "031640f7abf80b306cbe697a7abbea4b69abeeb5aee12d8712c274e519f372ee"
