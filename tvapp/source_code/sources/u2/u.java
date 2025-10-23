package u2;

import Z2.AbstractC0156a;
import android.view.View;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class u {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14914a = 1;

    /* renamed from: b  reason: collision with root package name */
    public int f14915b;

    /* renamed from: c  reason: collision with root package name */
    public int f14916c;
    public boolean d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f14917e;
    public Object f;

    public u() {
        f();
    }

    public void a(byte[] bArr, int i7, int i8) {
        if (!this.d) {
            return;
        }
        int i9 = i8 - i7;
        byte[] bArr2 = (byte[]) this.f;
        int length = bArr2.length;
        int i10 = this.f14916c;
        if (length < i10 + i9) {
            this.f = Arrays.copyOf(bArr2, (i10 + i9) * 2);
        }
        System.arraycopy(bArr, i7, (byte[]) this.f, this.f14916c, i9);
        this.f14916c += i9;
    }

    public void b() {
        int k5;
        if (this.d) {
            k5 = ((androidx.emoji2.text.f) this.f).g();
        } else {
            k5 = ((androidx.emoji2.text.f) this.f).k();
        }
        this.f14916c = k5;
    }

    public void c(View view, int i7) {
        if (this.d) {
            this.f14916c = ((androidx.emoji2.text.f) this.f).m() + ((androidx.emoji2.text.f) this.f).b(view);
        } else {
            this.f14916c = ((androidx.emoji2.text.f) this.f).e(view);
        }
        this.f14915b = i7;
    }

    public void d(View view, int i7) {
        int min;
        int m7 = ((androidx.emoji2.text.f) this.f).m();
        if (m7 >= 0) {
            c(view, i7);
            return;
        }
        this.f14915b = i7;
        if (this.d) {
            int g7 = (((androidx.emoji2.text.f) this.f).g() - m7) - ((androidx.emoji2.text.f) this.f).b(view);
            this.f14916c = ((androidx.emoji2.text.f) this.f).g() - g7;
            if (g7 > 0) {
                int c5 = this.f14916c - ((androidx.emoji2.text.f) this.f).c(view);
                int k5 = ((androidx.emoji2.text.f) this.f).k();
                int min2 = c5 - (Math.min(((androidx.emoji2.text.f) this.f).e(view) - k5, 0) + k5);
                if (min2 < 0) {
                    min = Math.min(g7, -min2) + this.f14916c;
                } else {
                    return;
                }
            } else {
                return;
            }
        } else {
            int e3 = ((androidx.emoji2.text.f) this.f).e(view);
            int k7 = e3 - ((androidx.emoji2.text.f) this.f).k();
            this.f14916c = e3;
            if (k7 > 0) {
                int g8 = (((androidx.emoji2.text.f) this.f).g() - Math.min(0, (((androidx.emoji2.text.f) this.f).g() - m7) - ((androidx.emoji2.text.f) this.f).b(view))) - (((androidx.emoji2.text.f) this.f).c(view) + e3);
                if (g8 < 0) {
                    min = this.f14916c - Math.min(k7, -g8);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        this.f14916c = min;
    }

    public boolean e(int i7) {
        if (!this.d) {
            return false;
        }
        this.f14916c -= i7;
        this.d = false;
        this.f14917e = true;
        return true;
    }

    public final void f() {
        switch (this.f14914a) {
            case 0:
                this.d = false;
                this.f14917e = false;
                return;
            default:
                this.f14915b = -1;
                this.f14916c = Integer.MIN_VALUE;
                this.d = false;
                this.f14917e = false;
                return;
        }
    }

    public void g(int i7) {
        boolean z7 = true;
        AbstractC0156a.k(!this.d);
        if (i7 != this.f14915b) {
            z7 = false;
        }
        this.d = z7;
        if (z7) {
            this.f14916c = 3;
            this.f14917e = false;
        }
    }

    public String toString() {
        switch (this.f14914a) {
            case 1:
                return "AnchorInfo{mPosition=" + this.f14915b + ", mCoordinate=" + this.f14916c + ", mLayoutFromEnd=" + this.d + ", mValid=" + this.f14917e + '}';
            default:
                return super.toString();
        }
    }

    public u(int i7) {
        this.f14915b = i7;
        byte[] bArr = new byte[131];
        this.f = bArr;
        bArr[2] = 1;
    }
}
