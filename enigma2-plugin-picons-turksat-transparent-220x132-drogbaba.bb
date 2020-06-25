DESCRIPTION = "Enigma2 Turksat-Transparent-Picon-220x132 by erkan"
MAINTAINER = "drogbaba <www.dreamosat-forum.com>"
HOMEPAGE = "https://www.dreamosat-forum.com"
PRIORITY = "optional"

require conf/license/license-gplv2.inc

PICONS_FILENAME = "Turksat-Transparent-Picon-220x132"

inherit gitpkgv allarch
SRCREV = "${AUTOREV}"

PV = "git${SRCPV}"
PKGV = "git${GITPKGV}"

SRC_URI = "git://github.com/drogbaba01/Transparent-Picon.git"

S = "${WORKDIR}/git"

FILES_${PN} = "${datadir}"

do_install () {
	install -d ${D}${datadir}/enigma2/picon
	cp -rf ${S}/${PICONS_FILENAME}/* ${D}${datadir}/enigma2/picon/
}
