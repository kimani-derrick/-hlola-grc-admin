package g2;

import O3.AbstractC0072p;
import O3.AbstractC0080y;
import O3.Z;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.provider.Settings;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* renamed from: g2.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0716g {

    /* renamed from: c  reason: collision with root package name */
    public static final C0716g f10685c = new C0716g(new int[]{2}, 10);
    public static final O3.U d;

    /* renamed from: e  reason: collision with root package name */
    public static final Z f10686e;

    /* renamed from: a  reason: collision with root package name */
    public final int[] f10687a;

    /* renamed from: b  reason: collision with root package name */
    public final int f10688b;

    static {
        Object[] objArr = {2, 5, 6};
        AbstractC0072p.b(3, objArr);
        d = O3.E.o(3, objArr);
        C.d dVar = new C.d(4, 4);
        dVar.z(5, 6);
        dVar.z(17, 6);
        dVar.z(7, 6);
        dVar.z(30, 10);
        dVar.z(18, 6);
        dVar.z(6, 8);
        dVar.z(8, 8);
        dVar.z(14, 8);
        f10686e = dVar.c();
    }

    public C0716g(int[] iArr, int i7) {
        if (iArr != null) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.f10687a = copyOf;
            Arrays.sort(copyOf);
        } else {
            this.f10687a = new int[0];
        }
        this.f10688b = i7;
    }

    public static boolean a() {
        if (Z2.H.f4603a >= 17) {
            String str = Z2.H.f4605c;
            if ("Amazon".equals(str) || "Xiaomi".equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static C0716g b(Context context) {
        return c(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")));
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [O3.G, O3.y] */
    public static C0716g c(Context context, Intent intent) {
        List aVar;
        int i7 = Z2.H.f4603a;
        C0716g c0716g = f10685c;
        if (i7 >= 23 && AbstractC0714e.b(context)) {
            return c0716g;
        }
        ?? abstractC0080y = new AbstractC0080y();
        if (a() && Settings.Global.getInt(context.getContentResolver(), "external_surround_sound_enabled", 0) == 1) {
            O3.U u7 = d;
            u7.getClass();
            abstractC0080y.e(u7);
        }
        if (i7 >= 29 && (Z2.H.I(context) || (i7 >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")))) {
            O3.E a7 = AbstractC0715f.a();
            a7.getClass();
            abstractC0080y.e(a7);
            return new C0716g(android.support.v4.media.session.b.B0(abstractC0080y.i()), 10);
        } else if (intent != null && intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) == 1) {
            int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
            if (intArrayExtra != null) {
                if (intArrayExtra.length == 0) {
                    aVar = Collections.emptyList();
                } else {
                    aVar = new Q3.a(0, intArrayExtra.length, intArrayExtra);
                }
                List list = aVar;
                list.getClass();
                abstractC0080y.e(list);
            }
            return new C0716g(android.support.v4.media.session.b.B0(abstractC0080y.i()), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10));
        } else {
            O3.H i8 = abstractC0080y.i();
            if (!i8.isEmpty()) {
                return new C0716g(android.support.v4.media.session.b.B0(i8), 10);
            }
            return c0716g;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x009e, code lost:
        if (r8 != 5) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ba A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.util.Pair d(e2.K r10) {
        /*
            r9 = this;
            java.lang.String r0 = r10.f9655B
            r0.getClass()
            java.lang.String r1 = r10.f9684y
            int r0 = Z2.r.c(r0, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            O3.Z r2 = g2.C0716g.f10686e
            boolean r1 = r2.containsKey(r1)
            r3 = 0
            if (r1 != 0) goto L19
            return r3
        L19:
            int[] r1 = r9.f10687a
            r4 = 7
            r5 = 6
            r6 = 8
            r7 = 18
            if (r0 != r7) goto L2c
            int r8 = java.util.Arrays.binarySearch(r1, r7)
            if (r8 < 0) goto L2a
            goto L2c
        L2a:
            r0 = r5
            goto L40
        L2c:
            if (r0 != r6) goto L34
            int r8 = java.util.Arrays.binarySearch(r1, r6)
            if (r8 < 0) goto L3f
        L34:
            r8 = 30
            if (r0 != r8) goto L40
            int r8 = java.util.Arrays.binarySearch(r1, r8)
            if (r8 < 0) goto L3f
            goto L40
        L3f:
            r0 = r4
        L40:
            int r1 = java.util.Arrays.binarySearch(r1, r0)
            if (r1 < 0) goto Lc8
            r1 = -1
            int r8 = r10.f9667O
            if (r8 == r1) goto L62
            if (r0 != r7) goto L4e
            goto L62
        L4e:
            java.lang.String r10 = r10.f9655B
            java.lang.String r1 = "audio/vnd.dts.uhd;profile=p2"
            boolean r10 = r10.equals(r1)
            if (r10 == 0) goto L5d
            r10 = 10
            if (r8 <= r10) goto L8d
            return r3
        L5d:
            int r10 = r9.f10688b
            if (r8 <= r10) goto L8d
            return r3
        L62:
            int r10 = r10.f9668P
            if (r10 == r1) goto L67
            goto L6a
        L67:
            r10 = 48000(0xbb80, float:6.7262E-41)
        L6a:
            int r1 = Z2.H.f4603a
            r7 = 29
            if (r1 < r7) goto L76
            int r10 = g2.AbstractC0715f.b(r0, r10)
        L74:
            r8 = r10
            goto L8d
        L76:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
            r1 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r10 = r2.get(r10)
            if (r10 == 0) goto L86
            r1 = r10
        L86:
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r10 = r1.intValue()
            goto L74
        L8d:
            int r10 = Z2.H.f4603a
            r1 = 28
            if (r10 > r1) goto La1
            if (r8 != r4) goto L97
            r5 = r6
            goto La2
        L97:
            r1 = 3
            if (r8 == r1) goto La2
            r1 = 4
            if (r8 == r1) goto La2
            r1 = 5
            if (r8 != r1) goto La1
            goto La2
        La1:
            r5 = r8
        La2:
            r1 = 26
            if (r10 > r1) goto Lb4
            java.lang.String r10 = "fugu"
            java.lang.String r1 = Z2.H.f4604b
            boolean r10 = r10.equals(r1)
            if (r10 == 0) goto Lb4
            r10 = 1
            if (r5 != r10) goto Lb4
            r5 = 2
        Lb4:
            int r10 = Z2.H.p(r5)
            if (r10 != 0) goto Lbb
            return r3
        Lbb:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            android.util.Pair r10 = android.util.Pair.create(r0, r10)
            return r10
        Lc8:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: g2.C0716g.d(e2.K):android.util.Pair");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0716g)) {
            return false;
        }
        C0716g c0716g = (C0716g) obj;
        if (Arrays.equals(this.f10687a, c0716g.f10687a) && this.f10688b == c0716g.f10688b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.f10687a) * 31) + this.f10688b;
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f10688b + ", supportedEncodings=" + Arrays.toString(this.f10687a) + "]";
    }
}
