package a0;

import android.text.InputFilter;
import android.widget.TextView;
import p6.l;
/* renamed from: a0.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0196g extends l {

    /* renamed from: r  reason: collision with root package name */
    public final C0195f f4973r;

    public C0196g(TextView textView) {
        this.f4973r = new C0195f(textView);
    }

    @Override // p6.l
    public final void G(boolean z7) {
        boolean z8;
        if (androidx.emoji2.text.j.f5841j != null) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (!z8) {
            return;
        }
        this.f4973r.G(z7);
    }

    @Override // p6.l
    public final void H(boolean z7) {
        boolean z8;
        if (androidx.emoji2.text.j.f5841j != null) {
            z8 = true;
        } else {
            z8 = false;
        }
        boolean z9 = !z8;
        C0195f c0195f = this.f4973r;
        if (z9) {
            c0195f.f4972t = z7;
        } else {
            c0195f.H(z7);
        }
    }

    @Override // p6.l
    public final InputFilter[] v(InputFilter[] inputFilterArr) {
        boolean z7;
        if (androidx.emoji2.text.j.f5841j != null) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (!z7) {
            return inputFilterArr;
        }
        return this.f4973r.v(inputFilterArr);
    }
}
