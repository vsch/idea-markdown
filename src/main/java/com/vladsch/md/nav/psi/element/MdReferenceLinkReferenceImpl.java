// Copyright (c) 2015-2023 Vladimir Schneider <vladimir.schneider@gmail.com> Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package com.vladsch.md.nav.psi.element;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.tree.IElementType;
import com.vladsch.md.nav.psi.util.MdTypes;
import org.jetbrains.annotations.NotNull;

public class MdReferenceLinkReferenceImpl extends MdReferencingElementReferenceImpl implements MdReferenceLinkReference {
    public MdReferenceLinkReferenceImpl(ASTNode node) {
        super(node);
    }

    @NotNull
    @Override
    public String getReferenceDisplayName() {
        return MdReferenceImpl.REFERENCE_DISPLAY_NAME;
    }

    @NotNull
    @Override
    public IElementType getReferenceType() {
        return MdTypes.REFERENCE;
    }

    @Override
    public boolean isAcceptable(@NotNull PsiElement referenceElement, boolean forCompletion, final boolean exactReference) {
        return referenceElement instanceof MdReference;
    }
}
