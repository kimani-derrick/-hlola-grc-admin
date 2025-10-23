package W2;

import H2.n0;
import Z2.H;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.Map;
/* loaded from: classes.dex */
public final class h extends w {

    /* renamed from: g0  reason: collision with root package name */
    public static final /* synthetic */ int f3821g0 = 0;

    /* renamed from: Q  reason: collision with root package name */
    public final boolean f3822Q;

    /* renamed from: R  reason: collision with root package name */
    public final boolean f3823R;

    /* renamed from: S  reason: collision with root package name */
    public final boolean f3824S;

    /* renamed from: T  reason: collision with root package name */
    public final boolean f3825T;

    /* renamed from: U  reason: collision with root package name */
    public final boolean f3826U;

    /* renamed from: V  reason: collision with root package name */
    public final boolean f3827V;
    public final boolean W;

    /* renamed from: X  reason: collision with root package name */
    public final boolean f3828X;

    /* renamed from: Y  reason: collision with root package name */
    public final boolean f3829Y;

    /* renamed from: Z  reason: collision with root package name */
    public final boolean f3830Z;

    /* renamed from: a0  reason: collision with root package name */
    public final boolean f3831a0;

    /* renamed from: b0  reason: collision with root package name */
    public final boolean f3832b0;

    /* renamed from: c0  reason: collision with root package name */
    public final boolean f3833c0;

    /* renamed from: d0  reason: collision with root package name */
    public final boolean f3834d0;

    /* renamed from: e0  reason: collision with root package name */
    public final SparseArray f3835e0;

    /* renamed from: f0  reason: collision with root package name */
    public final SparseBooleanArray f3836f0;

    static {
        new h(new g());
        int i7 = H.f4603a;
        Integer.toString(1000, 36);
        Integer.toString(1001, 36);
        Integer.toString(1002, 36);
        Integer.toString(1003, 36);
        Integer.toString(1004, 36);
        Integer.toString(1005, 36);
        Integer.toString(1006, 36);
        Integer.toString(1007, 36);
        Integer.toString(1008, 36);
        Integer.toString(1009, 36);
        Integer.toString(1010, 36);
        Integer.toString(1011, 36);
        Integer.toString(1012, 36);
        Integer.toString(1013, 36);
        Integer.toString(1014, 36);
        Integer.toString(1015, 36);
        Integer.toString(1016, 36);
        Integer.toString(1017, 36);
    }

    public h(g gVar) {
        super(gVar);
        this.f3822Q = gVar.f3806A;
        this.f3823R = gVar.f3807B;
        this.f3824S = gVar.f3808C;
        this.f3825T = gVar.f3809D;
        this.f3826U = gVar.f3810E;
        this.f3827V = gVar.F;
        this.W = gVar.f3811G;
        this.f3828X = gVar.f3812H;
        this.f3829Y = gVar.f3813I;
        this.f3830Z = gVar.f3814J;
        this.f3831a0 = gVar.f3815K;
        this.f3832b0 = gVar.f3816L;
        this.f3833c0 = gVar.f3817M;
        this.f3834d0 = gVar.f3818N;
        this.f3835e0 = gVar.f3819O;
        this.f3836f0 = gVar.f3820P;
    }

    @Override // W2.w
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        if (super.equals(hVar) && this.f3822Q == hVar.f3822Q && this.f3823R == hVar.f3823R && this.f3824S == hVar.f3824S && this.f3825T == hVar.f3825T && this.f3826U == hVar.f3826U && this.f3827V == hVar.f3827V && this.W == hVar.W && this.f3828X == hVar.f3828X && this.f3829Y == hVar.f3829Y && this.f3830Z == hVar.f3830Z && this.f3831a0 == hVar.f3831a0 && this.f3832b0 == hVar.f3832b0 && this.f3833c0 == hVar.f3833c0 && this.f3834d0 == hVar.f3834d0) {
            SparseBooleanArray sparseBooleanArray = this.f3836f0;
            int size = sparseBooleanArray.size();
            SparseBooleanArray sparseBooleanArray2 = hVar.f3836f0;
            if (sparseBooleanArray2.size() == size) {
                int i7 = 0;
                while (true) {
                    if (i7 < size) {
                        if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i7)) < 0) {
                            break;
                        }
                        i7++;
                    } else {
                        SparseArray sparseArray = this.f3835e0;
                        int size2 = sparseArray.size();
                        SparseArray sparseArray2 = hVar.f3835e0;
                        if (sparseArray2.size() == size2) {
                            for (int i8 = 0; i8 < size2; i8++) {
                                int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i8));
                                if (indexOfKey >= 0) {
                                    Map map = (Map) sparseArray.valueAt(i8);
                                    Map map2 = (Map) sparseArray2.valueAt(indexOfKey);
                                    if (map2.size() == map.size()) {
                                        for (Map.Entry entry : map.entrySet()) {
                                            n0 n0Var = (n0) entry.getKey();
                                            if (map2.containsKey(n0Var)) {
                                                if (!H.a(entry.getValue(), map2.get(n0Var))) {
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // W2.w
    public final int hashCode() {
        return ((((((((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.f3822Q ? 1 : 0)) * 31) + (this.f3823R ? 1 : 0)) * 31) + (this.f3824S ? 1 : 0)) * 31) + (this.f3825T ? 1 : 0)) * 31) + (this.f3826U ? 1 : 0)) * 31) + (this.f3827V ? 1 : 0)) * 31) + (this.W ? 1 : 0)) * 31) + (this.f3828X ? 1 : 0)) * 31) + (this.f3829Y ? 1 : 0)) * 31) + (this.f3830Z ? 1 : 0)) * 31) + (this.f3831a0 ? 1 : 0)) * 31) + (this.f3832b0 ? 1 : 0)) * 31) + (this.f3833c0 ? 1 : 0)) * 31) + (this.f3834d0 ? 1 : 0);
    }
}
