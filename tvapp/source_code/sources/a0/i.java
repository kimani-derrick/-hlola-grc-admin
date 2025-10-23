package a0;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
/* loaded from: classes.dex */
public final class i implements TextWatcher {

    /* renamed from: q  reason: collision with root package name */
    public final EditText f4975q;

    /* renamed from: s  reason: collision with root package name */
    public h f4977s;

    /* renamed from: r  reason: collision with root package name */
    public final boolean f4976r = false;

    /* renamed from: t  reason: collision with root package name */
    public boolean f4978t = true;

    public i(EditText editText) {
        this.f4975q = editText;
    }

    public static void a(EditText editText, int i7) {
        int length;
        if (i7 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            androidx.emoji2.text.j a7 = androidx.emoji2.text.j.a();
            if (editableText == null) {
                length = 0;
            } else {
                a7.getClass();
                length = editableText.length();
            }
            a7.f(editableText, 0, length);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
        EditText editText = this.f4975q;
        if (!editText.isInEditMode() && this.f4978t) {
            if ((this.f4976r || androidx.emoji2.text.j.f5841j != null) && i8 <= i9 && (charSequence instanceof Spannable)) {
                int b7 = androidx.emoji2.text.j.a().b();
                if (b7 != 0) {
                    if (b7 != 1) {
                        if (b7 != 3) {
                            return;
                        }
                    } else {
                        androidx.emoji2.text.j.a().f((Spannable) charSequence, i7, i9 + i7);
                        return;
                    }
                }
                androidx.emoji2.text.j a7 = androidx.emoji2.text.j.a();
                if (this.f4977s == null) {
                    this.f4977s = new h(editText);
                }
                a7.g(this.f4977s);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
    }
}
