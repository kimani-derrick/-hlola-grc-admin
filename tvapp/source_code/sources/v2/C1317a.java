package v2;

import Z2.H;
import Z2.y;
import e2.C0593J;
import e2.K;
import e2.m0;
import k2.InterfaceC0948m;
import k2.w;
/* renamed from: v2.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1317a implements InterfaceC1318b {

    /* renamed from: m  reason: collision with root package name */
    public static final int[] f15286m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
    public static final int[] n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

    /* renamed from: a  reason: collision with root package name */
    public final InterfaceC0948m f15287a;

    /* renamed from: b  reason: collision with root package name */
    public final w f15288b;

    /* renamed from: c  reason: collision with root package name */
    public final s2.e f15289c;
    public final int d;

    /* renamed from: e  reason: collision with root package name */
    public final byte[] f15290e;
    public final y f;

    /* renamed from: g  reason: collision with root package name */
    public final int f15291g;

    /* renamed from: h  reason: collision with root package name */
    public final K f15292h;

    /* renamed from: i  reason: collision with root package name */
    public int f15293i;

    /* renamed from: j  reason: collision with root package name */
    public long f15294j;

    /* renamed from: k  reason: collision with root package name */
    public int f15295k;

    /* renamed from: l  reason: collision with root package name */
    public long f15296l;

    public C1317a(InterfaceC0948m interfaceC0948m, w wVar, s2.e eVar) {
        this.f15287a = interfaceC0948m;
        this.f15288b = wVar;
        this.f15289c = eVar;
        int i7 = eVar.f13591b;
        int max = Math.max(1, i7 / 10);
        this.f15291g = max;
        y yVar = new y((byte[]) eVar.f13593e);
        yVar.n();
        int n7 = yVar.n();
        this.d = n7;
        int i8 = eVar.f13590a;
        int i9 = eVar.f13592c;
        int i10 = (((i9 - (i8 * 4)) * 8) / (eVar.d * i8)) + 1;
        if (n7 == i10) {
            int g7 = H.g(max, n7);
            this.f15290e = new byte[g7 * i9];
            this.f = new y(n7 * 2 * i8 * g7);
            int i11 = ((i9 * i7) * 8) / n7;
            C0593J c0593j = new C0593J();
            c0593j.f9605k = "audio/raw";
            c0593j.f = i11;
            c0593j.f9601g = i11;
            c0593j.f9606l = max * 2 * i8;
            c0593j.f9617x = i8;
            c0593j.f9618y = i7;
            c0593j.f9619z = 2;
            this.f15292h = new K(c0593j);
            return;
        }
        throw m0.a("Expected frames per block: " + i10 + "; got: " + n7, null);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0045 A[ADDED_TO_REGION, EDGE_INSN: B:44:0x0045->B:14:0x0045 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x003c -> B:4:0x0020). Please submit an issue!!! */
    @Override // v2.InterfaceC1318b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(k2.C0943h r26, long r27) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v2.C1317a.a(k2.h, long):boolean");
    }

    @Override // v2.InterfaceC1318b
    public final void b(long j7) {
        this.f15293i = 0;
        this.f15294j = j7;
        this.f15295k = 0;
        this.f15296l = 0L;
    }

    @Override // v2.InterfaceC1318b
    public final void c(long j7, int i7) {
        this.f15287a.t(new C1321e(this.f15289c, this.d, i7, j7));
        this.f15288b.e(this.f15292h);
    }

    public final void d(int i7) {
        long j7 = this.f15294j;
        long j8 = this.f15296l;
        s2.e eVar = this.f15289c;
        long O5 = j7 + H.O(j8, 1000000L, eVar.f13591b);
        int i8 = i7 * 2 * eVar.f13590a;
        this.f15288b.c(O5, 1, i8, this.f15295k - i8, null);
        this.f15296l += i7;
        this.f15295k -= i8;
    }
}
