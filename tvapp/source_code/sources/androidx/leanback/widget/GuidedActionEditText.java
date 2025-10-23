package androidx.leanback.widget;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillValue;
import android.widget.EditText;
import android.widget.TextView;
/* loaded from: classes.dex */
public class GuidedActionEditText extends EditText {

    /* renamed from: q  reason: collision with root package name */
    public final Drawable f6374q;

    /* renamed from: r  reason: collision with root package name */
    public final A f6375r;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.leanback.widget.A, android.graphics.drawable.Drawable] */
    public GuidedActionEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 16842862);
        this.f6374q = getBackground();
        ?? drawable = new Drawable();
        this.f6375r = drawable;
        setBackground(drawable);
    }

    @Override // android.widget.TextView, android.view.View
    public final void autofill(AutofillValue autofillValue) {
        super.autofill(autofillValue);
    }

    @Override // android.widget.TextView, android.view.View
    public int getAutofillType() {
        return 1;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z7, int i7, Rect rect) {
        super.onFocusChanged(z7, i7, rect);
        setBackground(z7 ? this.f6374q : this.f6375r);
        if (z7) {
            return;
        }
        setFocusable(false);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName((isFocused() ? EditText.class : TextView.class).getName());
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onKeyPreIme(int i7, KeyEvent keyEvent) {
        return super.onKeyPreIme(i7, keyEvent);
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(w4.l0.Z(callback, this));
    }

    public void setImeKeyListener(B b7) {
    }

    public void setOnAutofillListener(InterfaceC0322z interfaceC0322z) {
    }
}
