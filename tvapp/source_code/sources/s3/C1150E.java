package s3;

import java.math.BigInteger;
import java.util.List;
import java.util.Locale;
/* renamed from: s3.E  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1150E extends AbstractC1157L {

    /* renamed from: A  reason: collision with root package name */
    public int f13763A;

    /* renamed from: B  reason: collision with root package name */
    public String f13764B;

    /* renamed from: C  reason: collision with root package name */
    public String f13765C;

    /* renamed from: D  reason: collision with root package name */
    public String f13766D;

    /* renamed from: E  reason: collision with root package name */
    public long f13767E;
    public String F;

    /* renamed from: s  reason: collision with root package name */
    public String f13768s;

    /* renamed from: t  reason: collision with root package name */
    public String f13769t;

    /* renamed from: u  reason: collision with root package name */
    public int f13770u;

    /* renamed from: v  reason: collision with root package name */
    public String f13771v;

    /* renamed from: w  reason: collision with root package name */
    public long f13772w;

    /* renamed from: x  reason: collision with root package name */
    public long f13773x;

    /* renamed from: y  reason: collision with root package name */
    public List f13774y;

    /* renamed from: z  reason: collision with root package name */
    public String f13775z;

    @Override // s3.AbstractC1157L
    public final boolean J() {
        return true;
    }

    public final String K() {
        H();
        g3.n.g(this.f13768s);
        return this.f13768s;
    }

    public final String L() {
        D();
        H();
        g3.n.g(this.f13764B);
        return this.f13764B;
    }

    public final void M() {
        String format;
        String str;
        D();
        if (!B().P().i(EnumC1196r0.f14217s)) {
            b().f13802C.d("Analytics Storage consent is not granted");
            format = null;
        } else {
            byte[] bArr = new byte[16];
            C().T0().nextBytes(bArr);
            format = String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        }
        C1154I b7 = b();
        if (format == null) {
            str = "null";
        } else {
            str = "not null";
        }
        b7.f13802C.d("Resetting session stitching token to ".concat(str));
        this.f13766D = format;
        ((C1175g0) this.f2765q).f14037D.getClass();
        this.f13767E = System.currentTimeMillis();
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0111 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01a7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0105 A[Catch: IllegalStateException -> 0x0148, TryCatch #3 {IllegalStateException -> 0x0148, blocks: (B:53:0x00f4, B:57:0x0109, B:61:0x0115, B:65:0x011d, B:67:0x0125, B:71:0x0137, B:75:0x0145, B:74:0x0141, B:70:0x0133, B:79:0x014c, B:81:0x015e, B:83:0x0163, B:82:0x0161, B:60:0x0111, B:56:0x0105), top: B:127:0x00f4 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0125 A[Catch: IllegalStateException -> 0x0148, TryCatch #3 {IllegalStateException -> 0x0148, blocks: (B:53:0x00f4, B:57:0x0109, B:61:0x0115, B:65:0x011d, B:67:0x0125, B:71:0x0137, B:75:0x0145, B:74:0x0141, B:70:0x0133, B:79:0x014c, B:81:0x015e, B:83:0x0163, B:82:0x0161, B:60:0x0111, B:56:0x0105), top: B:127:0x00f4 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x014c A[Catch: IllegalStateException -> 0x0148, TryCatch #3 {IllegalStateException -> 0x0148, blocks: (B:53:0x00f4, B:57:0x0109, B:61:0x0115, B:65:0x011d, B:67:0x0125, B:71:0x0137, B:75:0x0145, B:74:0x0141, B:70:0x0133, B:79:0x014c, B:81:0x015e, B:83:0x0163, B:82:0x0161, B:60:0x0111, B:56:0x0105), top: B:127:0x00f4 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0195  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void N() {
        /*
            Method dump skipped, instructions count: 546
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s3.C1150E.N():void");
    }
}
