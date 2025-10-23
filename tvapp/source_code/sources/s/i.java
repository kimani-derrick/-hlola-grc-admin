package s;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public boolean f13513a;

    /* renamed from: e  reason: collision with root package name */
    public float f13516e;

    /* renamed from: l  reason: collision with root package name */
    public int f13522l;

    /* renamed from: b  reason: collision with root package name */
    public int f13514b = -1;

    /* renamed from: c  reason: collision with root package name */
    public int f13515c = -1;
    public int d = 0;
    public boolean f = false;

    /* renamed from: g  reason: collision with root package name */
    public final float[] f13517g = new float[9];

    /* renamed from: h  reason: collision with root package name */
    public final float[] f13518h = new float[9];

    /* renamed from: i  reason: collision with root package name */
    public c[] f13519i = new c[16];

    /* renamed from: j  reason: collision with root package name */
    public int f13520j = 0;

    /* renamed from: k  reason: collision with root package name */
    public int f13521k = 0;

    public i(int i7) {
        this.f13522l = i7;
    }

    public final void a(c cVar) {
        int i7 = 0;
        while (true) {
            int i8 = this.f13520j;
            if (i7 < i8) {
                if (this.f13519i[i7] == cVar) {
                    return;
                }
                i7++;
            } else {
                c[] cVarArr = this.f13519i;
                if (i8 >= cVarArr.length) {
                    this.f13519i = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
                }
                c[] cVarArr2 = this.f13519i;
                int i9 = this.f13520j;
                cVarArr2[i9] = cVar;
                this.f13520j = i9 + 1;
                return;
            }
        }
    }

    public final void b(c cVar) {
        int i7 = this.f13520j;
        int i8 = 0;
        while (i8 < i7) {
            if (this.f13519i[i8] == cVar) {
                while (i8 < i7 - 1) {
                    c[] cVarArr = this.f13519i;
                    int i9 = i8 + 1;
                    cVarArr[i8] = cVarArr[i9];
                    i8 = i9;
                }
                this.f13520j--;
                return;
            }
            i8++;
        }
    }

    public final void c() {
        this.f13522l = 5;
        this.d = 0;
        this.f13514b = -1;
        this.f13515c = -1;
        this.f13516e = 0.0f;
        this.f = false;
        int i7 = this.f13520j;
        for (int i8 = 0; i8 < i7; i8++) {
            this.f13519i[i8] = null;
        }
        this.f13520j = 0;
        this.f13521k = 0;
        this.f13513a = false;
        Arrays.fill(this.f13518h, 0.0f);
    }

    public final void d(c cVar) {
        int i7 = this.f13520j;
        for (int i8 = 0; i8 < i7; i8++) {
            this.f13519i[i8].h(cVar, false);
        }
        this.f13520j = 0;
    }

    public final String toString() {
        return "" + this.f13514b;
    }
}
