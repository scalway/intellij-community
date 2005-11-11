/*
 * Created by IntelliJ IDEA.
 * User: dsl
 * Date: 16.04.2002
 * Time: 15:54:37
 * To change template for new class use 
 * Code Style | Class Templates options (Tools | IDE Options).
 */
package com.intellij.refactoring.makeStatic;

import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiMember;
import com.intellij.refactoring.RefactoringBundle;
import com.intellij.usageView.UsageViewBundle;
import com.intellij.usageView.UsageViewDescriptor;
import com.intellij.usageView.UsageViewUtil;

public class MakeMethodOrClassStaticViewDescriptor implements UsageViewDescriptor {

  private PsiMember myMember;
  private final String myProcessedElementsHeader;

  public MakeMethodOrClassStaticViewDescriptor(PsiMember member
  ) {
    myMember = member;
    String who = UsageViewUtil.capitalize(UsageViewUtil.getType(myMember));
    myProcessedElementsHeader = RefactoringBundle.message("make.static.elements.header", who);
  }

  public PsiElement[] getElements() {
    return new PsiElement[]{myMember};
  }


  public String getProcessedElementsHeader() {
    return myProcessedElementsHeader;
  }

  public String getCodeReferencesText(int usagesCount, int filesCount) {
    return RefactoringBundle.message("references.to.be.changed", UsageViewBundle.getReferencesString(usagesCount, filesCount));
  }

  public String getCommentReferencesText(int usagesCount, int filesCount) {
    return null;
  }

}
