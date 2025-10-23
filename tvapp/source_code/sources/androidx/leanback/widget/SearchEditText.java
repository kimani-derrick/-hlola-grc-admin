package androidx.leanback.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.KeyEvent;
/* loaded from: classes.dex */
public class SearchEditText extends K0 {

    /* renamed from: x  reason: collision with root package name */
    public InterfaceC0314r0 f6513x;

    public SearchEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onKeyPreIme(int i7, KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4) {
            InterfaceC0314r0 interfaceC0314r0 = this.f6513x;
            if (interfaceC0314r0 != null) {
                ((SearchBar) ((Z5.n) interfaceC0314r0).f4918q).getClass();
                return false;
            }
            return false;
        }
        return super.onKeyPreIme(i7, keyEvent);
    }

    @Override // androidx.leanback.widget.K0, android.widget.TextView
    public /* bridge */ /* synthetic */ void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    public void setFinalRecognizedText(CharSequence charSequence) {
        setText(charSequence);
        bringPointIntoView(length());
    }

    public void setOnKeyboardDismissListener(InterfaceC0314r0 interfaceC0314r0) {
        this.f6513x = interfaceC0314r0;
    }
}
