package a0;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;
/* renamed from: a0.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0193d implements InputFilter {

    /* renamed from: a  reason: collision with root package name */
    public final TextView f4966a;

    /* renamed from: b  reason: collision with root package name */
    public C0192c f4967b;

    public C0193d(TextView textView) {
        this.f4966a = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i7, int i8, Spanned spanned, int i9, int i10) {
        TextView textView = this.f4966a;
        if (textView.isInEditMode()) {
            return charSequence;
        }
        int b7 = androidx.emoji2.text.j.a().b();
        if (b7 != 0) {
            if (b7 != 1) {
                if (b7 != 3) {
                    return charSequence;
                }
            } else if ((i10 != 0 || i9 != 0 || spanned.length() != 0 || charSequence != textView.getText()) && charSequence != null) {
                if (i7 != 0 || i8 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i7, i8);
                }
                return androidx.emoji2.text.j.a().f(charSequence, 0, charSequence.length());
            } else {
                return charSequence;
            }
        }
        androidx.emoji2.text.j a7 = androidx.emoji2.text.j.a();
        if (this.f4967b == null) {
            this.f4967b = new C0192c(textView, this);
        }
        a7.g(this.f4967b);
        return charSequence;
    }
}
