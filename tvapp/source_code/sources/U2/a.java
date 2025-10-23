package U2;

import M2.g;
import M2.h;
import N3.e;
import Z2.AbstractC0156a;
import Z2.H;
import Z2.y;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.TypefaceSpan;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import java.nio.charset.Charset;
import java.util.List;
/* loaded from: classes.dex */
public final class a extends g {

    /* renamed from: m  reason: collision with root package name */
    public final y f3424m = new y();
    public final boolean n;

    /* renamed from: o  reason: collision with root package name */
    public final int f3425o;

    /* renamed from: p  reason: collision with root package name */
    public final int f3426p;

    /* renamed from: q  reason: collision with root package name */
    public final String f3427q;

    /* renamed from: r  reason: collision with root package name */
    public final float f3428r;

    /* renamed from: s  reason: collision with root package name */
    public final int f3429s;

    public a(List list) {
        if (list.size() == 1 && (((byte[]) list.get(0)).length == 48 || ((byte[]) list.get(0)).length == 53)) {
            byte[] bArr = (byte[]) list.get(0);
            this.f3425o = bArr[24];
            this.f3426p = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
            this.f3427q = "Serif".equals(new String(bArr, 43, bArr.length - 43, e.f2497c)) ? "serif" : "sans-serif";
            int i7 = bArr[25] * 20;
            this.f3429s = i7;
            boolean z7 = (bArr[0] & 32) != 0;
            this.n = z7;
            if (z7) {
                this.f3428r = H.i(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i7, 0.0f, 0.95f);
                return;
            } else {
                this.f3428r = 0.85f;
                return;
            }
        }
        this.f3425o = 0;
        this.f3426p = -1;
        this.f3427q = "sans-serif";
        this.n = false;
        this.f3428r = 0.85f;
        this.f3429s = -1;
    }

    public static void i(SpannableStringBuilder spannableStringBuilder, int i7, int i8, int i9, int i10, int i11) {
        if (i7 != i8) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i7 >>> 8) | ((i7 & 255) << 24)), i9, i10, i11 | 33);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void j(android.text.SpannableStringBuilder r5, int r6, int r7, int r8, int r9, int r10) {
        /*
            if (r6 == r7) goto L4d
            r7 = r10 | 33
            r10 = r6 & 1
            r0 = 1
            r1 = 0
            if (r10 == 0) goto Lc
            r10 = r0
            goto Ld
        Lc:
            r10 = r1
        Ld:
            r2 = r6 & 2
            if (r2 == 0) goto L13
            r2 = r0
            goto L14
        L13:
            r2 = r1
        L14:
            if (r10 == 0) goto L26
            android.text.style.StyleSpan r3 = new android.text.style.StyleSpan
            if (r2 == 0) goto L22
            r4 = 3
            r3.<init>(r4)
        L1e:
            r5.setSpan(r3, r8, r9, r7)
            goto L2f
        L22:
            r3.<init>(r0)
            goto L1e
        L26:
            if (r2 == 0) goto L2f
            android.text.style.StyleSpan r3 = new android.text.style.StyleSpan
            r4 = 2
            r3.<init>(r4)
            goto L1e
        L2f:
            r6 = r6 & 4
            if (r6 == 0) goto L34
            goto L35
        L34:
            r0 = r1
        L35:
            if (r0 == 0) goto L3f
            android.text.style.UnderlineSpan r6 = new android.text.style.UnderlineSpan
            r6.<init>()
            r5.setSpan(r6, r8, r9, r7)
        L3f:
            if (r0 != 0) goto L4d
            if (r10 != 0) goto L4d
            if (r2 != 0) goto L4d
            android.text.style.StyleSpan r6 = new android.text.style.StyleSpan
            r6.<init>(r1)
            r5.setSpan(r6, r8, r9, r7)
        L4d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: U2.a.j(android.text.SpannableStringBuilder, int, int, int, int, int):void");
    }

    @Override // M2.g
    public final h f(int i7, boolean z7, byte[] bArr) {
        String s6;
        y yVar = this.f3424m;
        yVar.D(i7, bArr);
        if (yVar.a() >= 2) {
            int z8 = yVar.z();
            if (z8 == 0) {
                s6 = "";
            } else {
                int i8 = yVar.f4692b;
                Charset B6 = yVar.B();
                int i9 = z8 - (yVar.f4692b - i8);
                if (B6 == null) {
                    B6 = e.f2497c;
                }
                s6 = yVar.s(i9, B6);
            }
            if (s6.isEmpty()) {
                return b.f3430r;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(s6);
            j(spannableStringBuilder, this.f3425o, 0, 0, spannableStringBuilder.length(), 16711680);
            i(spannableStringBuilder, this.f3426p, -1, 0, spannableStringBuilder.length(), 16711680);
            int length = spannableStringBuilder.length();
            int i10 = 0;
            String str = this.f3427q;
            if (str != "sans-serif") {
                spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length, 16711713);
            }
            float f = this.f3428r;
            while (yVar.a() >= 8) {
                int i11 = yVar.f4692b;
                int g7 = yVar.g();
                int g8 = yVar.g();
                if (g8 == 1937013100) {
                    if (yVar.a() >= 2) {
                        int z9 = yVar.z();
                        for (int i12 = i10; i12 < z9; i12++) {
                            if (yVar.a() >= 12) {
                                int z10 = yVar.z();
                                int z11 = yVar.z();
                                yVar.G(2);
                                int u7 = yVar.u();
                                yVar.G(1);
                                int g9 = yVar.g();
                                if (z11 > spannableStringBuilder.length()) {
                                    StringBuilder o7 = AbstractC0515y1.o(z11, "Truncating styl end (", ") to cueText.length() (");
                                    o7.append(spannableStringBuilder.length());
                                    o7.append(").");
                                    AbstractC0156a.K("Tx3gDecoder", o7.toString());
                                    z11 = spannableStringBuilder.length();
                                }
                                int i13 = z11;
                                if (z10 >= i13) {
                                    AbstractC0156a.K("Tx3gDecoder", "Ignoring styl with start (" + z10 + ") >= end (" + i13 + ").");
                                } else {
                                    j(spannableStringBuilder, u7, this.f3425o, z10, i13, 0);
                                    i(spannableStringBuilder, g9, this.f3426p, z10, i13, 0);
                                }
                            } else {
                                throw new Exception("Unexpected subtitle format.");
                            }
                        }
                        continue;
                    } else {
                        throw new Exception("Unexpected subtitle format.");
                    }
                } else if (g8 == 1952608120 && this.n) {
                    if (yVar.a() >= 2) {
                        f = H.i(yVar.z() / this.f3429s, 0.0f, 0.95f);
                    } else {
                        throw new Exception("Unexpected subtitle format.");
                    }
                }
                yVar.F(i11 + g7);
                i10 = 0;
            }
            return new b(new M2.b(spannableStringBuilder, null, null, null, f, 0, 0, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f));
        }
        throw new Exception("Unexpected subtitle format.");
    }
}
