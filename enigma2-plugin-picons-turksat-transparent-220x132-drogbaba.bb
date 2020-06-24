DESCRIPTION = "Enigma2 Turksat-Transparent-Picon-220x132 byerkan"
MAINTAINER = "drogbaba <www.dreamosat-forum.com>"
HOMEPAGE = "https://www.dreamosat-forum.com"
PRIORITY = "optional"

require conf/license/license-gplv2.inc

inherit gitpkgv allarch
SRCREV = "${AUTOREV}"

PV = "git${SRCPV}"
PKGV = "git${GITPKGV}"

SRC_URI = "git://github.com/drogbaba01/Transparent-Picon.git"

S = "${WORKDIR}/git/Turksat-Transparent-Picon-220x132"

FILES_${PN} = "/usr"

do_install () {
	install -d ${D}/usr/share/enigma2/picon
	cp -rf ${S}/* ${D}/usr/share/enigma2/picon/
}
