package androidx.emoji2.text;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;
/* loaded from: classes.dex */
public final class v implements Spannable {

    /* renamed from: q  reason: collision with root package name */
    public boolean f5872q = false;

    /* renamed from: r  reason: collision with root package name */
    public Spannable f5873r;

    public v(Spannable spannable) {
        this.f5873r = spannable;
    }

    public final void a() {
        L4.f fVar;
        Spannable spannable = this.f5873r;
        if (!this.f5872q) {
            if (Build.VERSION.SDK_INT < 28) {
                fVar = new L4.f(17);
            } else {
                fVar = new L4.f(17);
            }
            if (fVar.M(spannable)) {
                this.f5873r = new SpannableString(spannable);
            }
        }
        this.f5872q = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i7) {
        return this.f5873r.charAt(i7);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        IntStream chars;
        chars = this.f5873r.chars();
        return chars;
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        IntStream codePoints;
        codePoints = this.f5873r.codePoints();
        return codePoints;
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f5873r.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f5873r.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f5873r.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i7, int i8, Class cls) {
        return this.f5873r.getSpans(i7, i8, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f5873r.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i7, int i8, Class cls) {
        return this.f5873r.nextSpanTransition(i7, i8, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        a();
        this.f5873r.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i7, int i8, int i9) {
        a();
        this.f5873r.setSpan(obj, i7, i8, i9);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i7, int i8) {
        return this.f5873r.subSequence(i7, i8);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f5873r.toString();
    }

    public v(CharSequence charSequence) {
        this.f5873r = new SpannableString(charSequence);
    }
}
