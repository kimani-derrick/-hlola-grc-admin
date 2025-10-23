package a0;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import java.lang.ref.WeakReference;
/* renamed from: a0.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0192c extends androidx.emoji2.text.h {

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference f4964a;

    /* renamed from: b  reason: collision with root package name */
    public final WeakReference f4965b;

    public C0192c(TextView textView, C0193d c0193d) {
        this.f4964a = new WeakReference(textView);
        this.f4965b = new WeakReference(c0193d);
    }

    @Override // androidx.emoji2.text.h
    public final void a() {
        InputFilter[] filters;
        int length;
        TextView textView = (TextView) this.f4964a.get();
        InputFilter inputFilter = (InputFilter) this.f4965b.get();
        if (inputFilter != null && textView != null && (filters = textView.getFilters()) != null) {
            for (InputFilter inputFilter2 : filters) {
                if (inputFilter2 == inputFilter) {
                    if (textView.isAttachedToWindow()) {
                        CharSequence text = textView.getText();
                        androidx.emoji2.text.j a7 = androidx.emoji2.text.j.a();
                        if (text == null) {
                            length = 0;
                        } else {
                            a7.getClass();
                            length = text.length();
                        }
                        CharSequence f = a7.f(text, 0, length);
                        if (text == f) {
                            return;
                        }
                        int selectionStart = Selection.getSelectionStart(f);
                        int selectionEnd = Selection.getSelectionEnd(f);
                        textView.setText(f);
                        if (f instanceof Spannable) {
                            Spannable spannable = (Spannable) f;
                            if (selectionStart >= 0 && selectionEnd >= 0) {
                                Selection.setSelection(spannable, selectionStart, selectionEnd);
                                return;
                            } else if (selectionStart >= 0) {
                                Selection.setSelection(spannable, selectionStart);
                                return;
                            } else if (selectionEnd >= 0) {
                                Selection.setSelection(spannable, selectionEnd);
                                return;
                            } else {
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
            }
        }
    }
}
