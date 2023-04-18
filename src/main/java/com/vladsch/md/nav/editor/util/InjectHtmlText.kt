// Copyright (c) 2015-2023 Vladimir Schneider <vladimir.schneider@gmail.com> Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package com.vladsch.md.nav.editor.util

class InjectHtmlText(htmlPlacement: HtmlPlacement, isByScript: Boolean, val htmlText: String) : InjectHtmlResource(htmlPlacement, isByScript) {
    override fun htmlText(resourceUrl: String?): String = htmlText
    override fun resourceURL(): String? = null
}
