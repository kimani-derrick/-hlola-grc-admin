package L3;

import K.C0026b;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import com.boxhdo.android.tv.R;
import com.google.android.material.textfield.TextInputLayout;
/* loaded from: classes.dex */
public class w extends C0026b {
    public final TextInputLayout d;

    public w(TextInputLayout textInputLayout) {
        this.d = textInputLayout;
    }

    @Override // K.C0026b
    public void d(View view, L.i iVar) {
        CharSequence charSequence;
        String str;
        View.AccessibilityDelegate accessibilityDelegate = this.f1466a;
        AccessibilityNodeInfo accessibilityNodeInfo = iVar.f1854a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        TextInputLayout textInputLayout = this.d;
        EditText editText = textInputLayout.getEditText();
        if (editText != null) {
            charSequence = editText.getText();
        } else {
            charSequence = null;
        }
        CharSequence hint = textInputLayout.getHint();
        CharSequence error = textInputLayout.getError();
        CharSequence placeholderText = textInputLayout.getPlaceholderText();
        int counterMaxLength = textInputLayout.getCounterMaxLength();
        CharSequence counterOverflowDescription = textInputLayout.getCounterOverflowDescription();
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        boolean z7 = !isEmpty;
        boolean z8 = true;
        boolean z9 = !TextUtils.isEmpty(hint);
        boolean z10 = !textInputLayout.f8973V0;
        boolean z11 = !TextUtils.isEmpty(error);
        if (!z11 && TextUtils.isEmpty(counterOverflowDescription)) {
            z8 = false;
        }
        if (z9) {
            str = hint.toString();
        } else {
            str = "";
        }
        if (z7) {
            iVar.n(charSequence);
        } else if (!TextUtils.isEmpty(str)) {
            iVar.n(str);
            if (z10 && placeholderText != null) {
                iVar.n(str + ", " + ((Object) placeholderText));
            }
        } else if (placeholderText != null) {
            iVar.n(placeholderText);
        }
        if (!TextUtils.isEmpty(str)) {
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 26) {
                iVar.l(str);
            } else {
                if (z7) {
                    str = ((Object) charSequence) + ", " + str;
                }
                iVar.n(str);
            }
            if (i7 >= 26) {
                accessibilityNodeInfo.setShowingHintText(isEmpty);
            } else {
                iVar.h(4, isEmpty);
            }
        }
        accessibilityNodeInfo.setMaxTextLength((charSequence == null || charSequence.length() != counterMaxLength) ? -1 : -1);
        if (z8) {
            if (!z11) {
                error = counterOverflowDescription;
            }
            accessibilityNodeInfo.setError(error);
        }
        if (editText != null) {
            editText.setLabelFor(R.id.textinput_helper_text);
        }
    }
}
