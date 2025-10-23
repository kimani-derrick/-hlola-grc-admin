package Z2;

import android.opengl.GLES20;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import g2.O;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import k.C0852F;
import k2.InterfaceC0948m;
import w0.K;
import w0.L;
import w0.k0;
/* renamed from: Z2.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0163h implements u2.z {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f4634q;

    /* renamed from: r  reason: collision with root package name */
    public int f4635r;

    /* renamed from: s  reason: collision with root package name */
    public final Object f4636s;

    /* renamed from: t  reason: collision with root package name */
    public final Object f4637t;

    /* renamed from: u  reason: collision with root package name */
    public final Cloneable f4638u;

    /* renamed from: v  reason: collision with root package name */
    public Object f4639v;

    /* JADX WARN: Multi-variable type inference failed */
    public C0163h(O o7, C0852F c0852f, byte[] bArr, X0.j[] jVarArr, int i7) {
        this.f4634q = 1;
        this.f4636s = o7;
        this.f4637t = c0852f;
        this.f4638u = bArr;
        this.f4639v = jVarArr;
        this.f4635r = i7;
    }

    public static void a(int i7, int i8, String str) {
        int glCreateShader = GLES20.glCreateShader(i8);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        boolean z7 = false;
        int[] iArr = {0};
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] == 1) {
            z7 = true;
        }
        AbstractC0156a.h(GLES20.glGetShaderInfoLog(glCreateShader) + ", source: " + str, z7);
        GLES20.glAttachShader(i7, glCreateShader);
        GLES20.glDeleteShader(glCreateShader);
        AbstractC0156a.g();
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x015a, code lost:
        if (r28.u() == 21) goto L43;
     */
    @Override // u2.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(Z2.y r28) {
        /*
            Method dump skipped, instructions count: 695
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Z2.C0163h.c(Z2.y):void");
    }

    public void d(View view, int i7, boolean z7) {
        int j7;
        K k5 = (K) this.f4636s;
        if (i7 < 0) {
            j7 = k5.f15465q.getChildCount();
        } else {
            j7 = j(i7);
        }
        ((M2.e) this.f4637t).z(j7, z7);
        if (z7) {
            m(view);
        }
        RecyclerView recyclerView = k5.f15465q;
        recyclerView.addView(view, j7);
        k0 N6 = RecyclerView.N(view);
        L l7 = recyclerView.f6893C;
        if (l7 != null && N6 != null) {
            l7.h(N6);
        }
    }

    public void e(View view, int i7, ViewGroup.LayoutParams layoutParams, boolean z7) {
        int j7;
        K k5 = (K) this.f4636s;
        if (i7 < 0) {
            j7 = k5.f15465q.getChildCount();
        } else {
            j7 = j(i7);
        }
        ((M2.e) this.f4637t).z(j7, z7);
        if (z7) {
            m(view);
        }
        k5.getClass();
        k0 N6 = RecyclerView.N(view);
        RecyclerView recyclerView = k5.f15465q;
        if (N6 != null) {
            if (!N6.o() && !N6.t()) {
                StringBuilder sb = new StringBuilder("Called attach on a child which is not detached: ");
                sb.append(N6);
                throw new IllegalArgumentException(AbstractC0515y1.k(recyclerView, sb));
            }
            if (RecyclerView.U0) {
                Log.d("RecyclerView", "reAttach " + N6);
            }
            N6.f15583j &= -257;
        } else if (RecyclerView.f6880T0) {
            StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            sb2.append(", index: ");
            sb2.append(j7);
            throw new IllegalArgumentException(AbstractC0515y1.k(recyclerView, sb2));
        }
        recyclerView.attachViewToParent(view, j7, layoutParams);
    }

    public void f(int i7) {
        int j7 = j(i7);
        ((M2.e) this.f4637t).B(j7);
        RecyclerView recyclerView = ((K) this.f4636s).f15465q;
        View childAt = recyclerView.getChildAt(j7);
        if (childAt != null) {
            k0 N6 = RecyclerView.N(childAt);
            if (N6 != null) {
                if (N6.o() && !N6.t()) {
                    StringBuilder sb = new StringBuilder("called detach on an already detached child ");
                    sb.append(N6);
                    throw new IllegalArgumentException(AbstractC0515y1.k(recyclerView, sb));
                }
                if (RecyclerView.U0) {
                    Log.d("RecyclerView", "tmpDetach " + N6);
                }
                N6.c(256);
            }
        } else if (RecyclerView.f6880T0) {
            StringBuilder sb2 = new StringBuilder("No view at offset ");
            sb2.append(j7);
            throw new IllegalArgumentException(AbstractC0515y1.k(recyclerView, sb2));
        }
        recyclerView.detachViewFromParent(j7);
    }

    public int g(String str) {
        int glGetAttribLocation = GLES20.glGetAttribLocation(this.f4635r, str);
        GLES20.glEnableVertexAttribArray(glGetAttribLocation);
        AbstractC0156a.g();
        return glGetAttribLocation;
    }

    public View h(int i7) {
        return ((K) this.f4636s).f15465q.getChildAt(j(i7));
    }

    public int i() {
        return ((K) this.f4636s).f15465q.getChildCount() - ((ArrayList) this.f4638u).size();
    }

    public int j(int i7) {
        if (i7 < 0) {
            return -1;
        }
        int childCount = ((K) this.f4636s).f15465q.getChildCount();
        int i8 = i7;
        while (i8 < childCount) {
            M2.e eVar = (M2.e) this.f4637t;
            int w7 = i7 - (i8 - eVar.w(i8));
            if (w7 == 0) {
                while (eVar.y(i8)) {
                    i8++;
                }
                return i8;
            }
            i8 += w7;
        }
        return -1;
    }

    public View k(int i7) {
        return ((K) this.f4636s).f15465q.getChildAt(i7);
    }

    public int l() {
        return ((K) this.f4636s).f15465q.getChildCount();
    }

    public void m(View view) {
        ((ArrayList) this.f4638u).add(view);
        K k5 = (K) this.f4636s;
        k5.getClass();
        k0 N6 = RecyclerView.N(view);
        if (N6 != null) {
            int i7 = N6.f15589q;
            View view2 = N6.f15576a;
            if (i7 != -1) {
                N6.f15588p = i7;
            } else {
                Field field = K.O.f1447a;
                N6.f15588p = view2.getImportantForAccessibility();
            }
            RecyclerView recyclerView = k5.f15465q;
            if (recyclerView.R()) {
                N6.f15589q = 4;
                recyclerView.f6910L0.add(N6);
                return;
            }
            Field field2 = K.O.f1447a;
            view2.setImportantForAccessibility(4);
        }
    }

    public int n(View view) {
        int indexOfChild = ((K) this.f4636s).f15465q.indexOfChild(view);
        if (indexOfChild == -1) {
            return -1;
        }
        M2.e eVar = (M2.e) this.f4637t;
        if (eVar.y(indexOfChild)) {
            return -1;
        }
        return indexOfChild - eVar.w(indexOfChild);
    }

    public boolean o(View view) {
        return ((ArrayList) this.f4638u).contains(view);
    }

    public void p(int i7) {
        K k5 = (K) this.f4636s;
        int i8 = this.f4635r;
        if (i8 != 1) {
            if (i8 != 2) {
                try {
                    int j7 = j(i7);
                    View childAt = k5.f15465q.getChildAt(j7);
                    if (childAt == null) {
                        this.f4635r = 0;
                        this.f4639v = null;
                        return;
                    }
                    this.f4635r = 1;
                    this.f4639v = childAt;
                    if (((M2.e) this.f4637t).B(j7)) {
                        q(childAt);
                    }
                    k5.i(j7);
                    this.f4635r = 0;
                    this.f4639v = null;
                    return;
                } catch (Throwable th) {
                    this.f4635r = 0;
                    this.f4639v = null;
                    throw th;
                }
            }
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
    }

    public void q(View view) {
        if (((ArrayList) this.f4638u).remove(view)) {
            K k5 = (K) this.f4636s;
            k5.getClass();
            k0 N6 = RecyclerView.N(view);
            if (N6 != null) {
                int i7 = N6.f15588p;
                RecyclerView recyclerView = k5.f15465q;
                if (recyclerView.R()) {
                    N6.f15589q = i7;
                    recyclerView.f6910L0.add(N6);
                } else {
                    Field field = K.O.f1447a;
                    N6.f15576a.setImportantForAccessibility(i7);
                }
                N6.f15588p = 0;
            }
        }
    }

    public String toString() {
        switch (this.f4634q) {
            case 3:
                return ((M2.e) this.f4637t).toString() + ", hidden list:" + ((ArrayList) this.f4638u).size();
            default:
                return super.toString();
        }
    }

    public C0163h(String str, String str2) {
        byte[] bArr;
        byte[] bArr2;
        this.f4634q = 0;
        int glCreateProgram = GLES20.glCreateProgram();
        this.f4635r = glCreateProgram;
        AbstractC0156a.g();
        a(glCreateProgram, 35633, str);
        a(glCreateProgram, 35632, str2);
        GLES20.glLinkProgram(glCreateProgram);
        int i7 = 0;
        int[] iArr = {0};
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        int i8 = 1;
        AbstractC0156a.h("Unable to link shader program: \n" + GLES20.glGetProgramInfoLog(glCreateProgram), iArr[0] == 1);
        GLES20.glUseProgram(glCreateProgram);
        this.f4638u = new HashMap();
        int[] iArr2 = new int[1];
        GLES20.glGetProgramiv(glCreateProgram, 35721, iArr2, 0);
        this.f4636s = new L4.f[iArr2[0]];
        int i9 = 0;
        while (i9 < iArr2[0]) {
            int i10 = this.f4635r;
            int[] iArr3 = new int[i8];
            GLES20.glGetProgramiv(i10, 35722, iArr3, 0);
            int i11 = iArr3[0];
            byte[] bArr3 = new byte[i11];
            GLES20.glGetActiveAttrib(i10, i9, i11, new int[i8], 0, new int[i8], 0, new int[i8], 0, bArr3, 0);
            int i12 = 0;
            while (true) {
                bArr2 = bArr3;
                if (i12 >= i11) {
                    i12 = i11;
                    break;
                } else if (bArr2[i12] == 0) {
                    break;
                } else {
                    i12++;
                    bArr3 = bArr2;
                }
            }
            String str3 = new String(bArr2, 0, i12);
            GLES20.glGetAttribLocation(i10, str3);
            L4.f fVar = new L4.f(13);
            ((L4.f[]) this.f4636s)[i9] = fVar;
            ((HashMap) this.f4638u).put(str3, fVar);
            i9++;
            i8 = 1;
        }
        this.f4639v = new HashMap();
        int[] iArr4 = new int[1];
        GLES20.glGetProgramiv(this.f4635r, 35718, iArr4, 0);
        this.f4637t = new J3.e[iArr4[0]];
        for (int i13 = 0; i13 < iArr4[i7]; i13++) {
            int i14 = this.f4635r;
            int[] iArr5 = new int[1];
            GLES20.glGetProgramiv(i14, 35719, iArr5, i7);
            int i15 = iArr5[i7];
            byte[] bArr4 = new byte[i15];
            GLES20.glGetActiveUniform(i14, i13, i15, new int[1], 0, new int[1], 0, new int[1], 0, bArr4, 0);
            int i16 = 0;
            while (true) {
                bArr = bArr4;
                if (i16 >= i15) {
                    i16 = i15;
                    break;
                } else if (bArr[i16] == 0) {
                    break;
                } else {
                    i16++;
                    bArr4 = bArr;
                }
            }
            i7 = 0;
            String str4 = new String(bArr, 0, i16);
            GLES20.glGetUniformLocation(i14, str4);
            J3.e eVar = new J3.e(14);
            ((J3.e[]) this.f4637t)[i13] = eVar;
            ((HashMap) this.f4639v).put(str4, eVar);
        }
        AbstractC0156a.g();
    }

    public C0163h(u2.D d, int i7) {
        this.f4634q = 2;
        this.f4639v = d;
        this.f4636s = new N2.f(5, new byte[5]);
        this.f4637t = new SparseArray();
        this.f4638u = new SparseIntArray();
        this.f4635r = i7;
    }

    public C0163h(K k5) {
        this.f4634q = 3;
        this.f4635r = 0;
        this.f4636s = k5;
        this.f4637t = new M2.e(8);
        this.f4638u = new ArrayList();
    }

    @Override // u2.z
    public void b(E e3, InterfaceC0948m interfaceC0948m, u2.F f) {
    }
}
