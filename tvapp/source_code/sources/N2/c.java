package N2;

import Z2.AbstractC0156a;
import Z2.y;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class c extends i {

    /* renamed from: h  reason: collision with root package name */
    public final int f2424h;

    /* renamed from: i  reason: collision with root package name */
    public final int f2425i;

    /* renamed from: j  reason: collision with root package name */
    public final int f2426j;
    public List n;

    /* renamed from: o  reason: collision with root package name */
    public List f2430o;

    /* renamed from: p  reason: collision with root package name */
    public int f2431p;

    /* renamed from: q  reason: collision with root package name */
    public int f2432q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f2433r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f2434s;

    /* renamed from: t  reason: collision with root package name */
    public byte f2435t;

    /* renamed from: u  reason: collision with root package name */
    public byte f2436u;

    /* renamed from: w  reason: collision with root package name */
    public boolean f2438w;

    /* renamed from: x  reason: collision with root package name */
    public long f2439x;

    /* renamed from: y  reason: collision with root package name */
    public static final int[] f2421y = {11, 1, 3, 12, 14, 5, 7, 9};

    /* renamed from: z  reason: collision with root package name */
    public static final int[] f2422z = {0, 4, 8, 12, 16, 20, 24, 28};

    /* renamed from: A  reason: collision with root package name */
    public static final int[] f2416A = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};

    /* renamed from: B  reason: collision with root package name */
    public static final int[] f2417B = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, ModuleDescriptor.MODULE_VERSION, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};

    /* renamed from: C  reason: collision with root package name */
    public static final int[] f2418C = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};

    /* renamed from: D  reason: collision with root package name */
    public static final int[] f2419D = {193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};

    /* renamed from: E  reason: collision with root package name */
    public static final int[] f2420E = {195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};
    public static final boolean[] F = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    /* renamed from: g  reason: collision with root package name */
    public final y f2423g = new y();

    /* renamed from: l  reason: collision with root package name */
    public final ArrayList f2428l = new ArrayList();

    /* renamed from: m  reason: collision with root package name */
    public b f2429m = new b(0, 4);

    /* renamed from: v  reason: collision with root package name */
    public int f2437v = 0;

    /* renamed from: k  reason: collision with root package name */
    public final long f2427k = 16000000;

    public c(String str, int i7) {
        int i8;
        if ("application/x-mp4-cea-608".equals(str)) {
            i8 = 2;
        } else {
            i8 = 3;
        }
        this.f2424h = i8;
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    if (i7 != 4) {
                        AbstractC0156a.K("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
                    } else {
                        this.f2426j = 1;
                    }
                } else {
                    this.f2426j = 0;
                }
                this.f2425i = 1;
                l(0);
                k();
                this.f2438w = true;
                this.f2439x = -9223372036854775807L;
            }
            this.f2426j = 1;
            this.f2425i = 0;
            l(0);
            k();
            this.f2438w = true;
            this.f2439x = -9223372036854775807L;
        }
        this.f2426j = 0;
        this.f2425i = 0;
        l(0);
        k();
        this.f2438w = true;
        this.f2439x = -9223372036854775807L;
    }

    @Override // N2.i
    public final j f() {
        List list = this.n;
        this.f2430o = list;
        list.getClass();
        return new j(0, list);
    }

    @Override // N2.i, i2.d
    public final void flush() {
        super.flush();
        this.n = null;
        this.f2430o = null;
        l(0);
        this.f2432q = 4;
        this.f2429m.f2415h = 4;
        k();
        this.f2433r = false;
        this.f2434s = false;
        this.f2435t = (byte) 0;
        this.f2436u = (byte) 0;
        this.f2437v = 0;
        this.f2438w = true;
        this.f2439x = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:177:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x00ab A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x007e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0014 A[SYNTHETIC] */
    @Override // N2.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(N2.h r15) {
        /*
            Method dump skipped, instructions count: 664
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: N2.c.g(N2.h):void");
    }

    @Override // N2.i, i2.d
    /* renamed from: h */
    public final M2.d d() {
        M2.d dVar;
        M2.d d = super.d();
        if (d != null) {
            return d;
        }
        long j7 = this.f2427k;
        if (j7 != -9223372036854775807L) {
            long j8 = this.f2439x;
            if (j8 != -9223372036854775807L && this.f2488e - j8 >= j7 && (dVar = (M2.d) this.f2486b.pollFirst()) != null) {
                this.n = Collections.emptyList();
                this.f2439x = -9223372036854775807L;
                dVar.g(this.f2488e, f(), Long.MAX_VALUE);
                return dVar;
            }
            return null;
        }
        return null;
    }

    @Override // N2.i
    public final boolean i() {
        if (this.n != this.f2430o) {
            return true;
        }
        return false;
    }

    public final ArrayList j() {
        ArrayList arrayList = this.f2428l;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        int i7 = 2;
        for (int i8 = 0; i8 < size; i8++) {
            M2.b c5 = ((b) arrayList.get(i8)).c(Integer.MIN_VALUE);
            arrayList2.add(c5);
            if (c5 != null) {
                i7 = Math.min(i7, c5.f2251y);
            }
        }
        ArrayList arrayList3 = new ArrayList(size);
        for (int i9 = 0; i9 < size; i9++) {
            M2.b bVar = (M2.b) arrayList2.get(i9);
            if (bVar != null) {
                if (bVar.f2251y != i7) {
                    bVar = ((b) arrayList.get(i9)).c(i7);
                    bVar.getClass();
                }
                arrayList3.add(bVar);
            }
        }
        return arrayList3;
    }

    public final void k() {
        b bVar = this.f2429m;
        bVar.f2414g = this.f2431p;
        bVar.f2410a.clear();
        bVar.f2411b.clear();
        bVar.f2412c.setLength(0);
        bVar.d = 15;
        bVar.f2413e = 0;
        bVar.f = 0;
        ArrayList arrayList = this.f2428l;
        arrayList.clear();
        arrayList.add(this.f2429m);
    }

    public final void l(int i7) {
        int i8 = this.f2431p;
        if (i8 == i7) {
            return;
        }
        this.f2431p = i7;
        if (i7 == 3) {
            int i9 = 0;
            while (true) {
                ArrayList arrayList = this.f2428l;
                if (i9 < arrayList.size()) {
                    ((b) arrayList.get(i9)).f2414g = i7;
                    i9++;
                } else {
                    return;
                }
            }
        } else {
            k();
            if (i8 == 3 || i7 == 1 || i7 == 0) {
                this.n = Collections.emptyList();
            }
        }
    }

    @Override // N2.i, i2.d
    public final void a() {
    }
}
