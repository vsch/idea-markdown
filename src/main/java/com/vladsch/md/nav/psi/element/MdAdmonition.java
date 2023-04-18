// Copyright (c) 2015-2023 Vladimir Schneider <vladimir.schneider@gmail.com> Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package com.vladsch.md.nav.psi.element;

import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface MdAdmonition extends MdIndentingComposite, MdBlockElementWithChildren {

    @NotNull
    String getMarker();

    @Nullable
    ASTNode getInfoNode();

    @NotNull
    String getInfo();

    @Nullable
    ASTNode getTitleElement();

    @Nullable
    String getTitle();
}
