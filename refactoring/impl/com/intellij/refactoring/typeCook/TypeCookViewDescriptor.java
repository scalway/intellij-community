package com.intellij.refactoring.typeCook;

import com.intellij.psi.PsiElement;
import com.intellij.refactoring.RefactoringBundle;
import com.intellij.usageView.UsageViewBundle;
import com.intellij.usageView.UsageViewDescriptor;

class TypeCookViewDescriptor implements UsageViewDescriptor {
  private PsiElement[] myElements;

  public TypeCookViewDescriptor(PsiElement[] elements) {
    myElements = elements;
  }

  public PsiElement[] getElements() {
    return myElements;
  }

  public String getProcessedElementsHeader() {
    return RefactoringBundle.message("type.cook.elements.header");
  }

  public String getCodeReferencesText(int usagesCount, int filesCount) {
    return RefactoringBundle.message("declaration.s.to.be.generified", UsageViewBundle.getReferencesString(usagesCount, filesCount));
  }

  public String getCommentReferencesText(int usagesCount, int filesCount) {
    return null;
  }

}