package W2;

import H2.m0;
import O3.E;
import Z2.AbstractC0156a;
import Z2.H;
import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.Display;
import android.view.WindowManager;
import android.view.accessibility.CaptioningManager;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
/* loaded from: classes.dex */
public final class g extends v {

    /* renamed from: A  reason: collision with root package name */
    public boolean f3806A;

    /* renamed from: B  reason: collision with root package name */
    public boolean f3807B;

    /* renamed from: C  reason: collision with root package name */
    public boolean f3808C;

    /* renamed from: D  reason: collision with root package name */
    public boolean f3809D;

    /* renamed from: E  reason: collision with root package name */
    public boolean f3810E;
    public boolean F;

    /* renamed from: G  reason: collision with root package name */
    public boolean f3811G;

    /* renamed from: H  reason: collision with root package name */
    public boolean f3812H;

    /* renamed from: I  reason: collision with root package name */
    public boolean f3813I;

    /* renamed from: J  reason: collision with root package name */
    public boolean f3814J;

    /* renamed from: K  reason: collision with root package name */
    public boolean f3815K;

    /* renamed from: L  reason: collision with root package name */
    public boolean f3816L;

    /* renamed from: M  reason: collision with root package name */
    public boolean f3817M;

    /* renamed from: N  reason: collision with root package name */
    public boolean f3818N;

    /* renamed from: O  reason: collision with root package name */
    public final SparseArray f3819O;

    /* renamed from: P  reason: collision with root package name */
    public final SparseBooleanArray f3820P;

    public g() {
        this.f3819O = new SparseArray();
        this.f3820P = new SparseBooleanArray();
        d();
    }

    @Override // W2.v
    public final void a(int i7) {
        super.a(i7);
    }

    @Override // W2.v
    public final v c(int i7, int i8) {
        super.c(i7, i8);
        return this;
    }

    public final void d() {
        this.f3806A = true;
        this.f3807B = false;
        this.f3808C = true;
        this.f3809D = false;
        this.f3810E = true;
        this.F = false;
        this.f3811G = false;
        this.f3812H = false;
        this.f3813I = false;
        this.f3814J = true;
        this.f3815K = true;
        this.f3816L = false;
        this.f3817M = true;
        this.f3818N = false;
    }

    public final void e(u uVar) {
        m0 m0Var = uVar.f3882q;
        a(m0Var.f1135s);
        this.f3905y.put(m0Var, uVar);
    }

    public final void f(Context context) {
        CaptioningManager captioningManager;
        String locale;
        int i7 = H.f4603a;
        if (i7 >= 19) {
            if ((i7 >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
                this.f3900t = 1088;
                Locale locale2 = captioningManager.getLocale();
                if (locale2 != null) {
                    if (i7 >= 21) {
                        locale = locale2.toLanguageTag();
                    } else {
                        locale = locale2.toString();
                    }
                    this.f3899s = E.x(locale);
                }
            }
        }
    }

    public final void g(int i7) {
        this.f3906z.remove(Integer.valueOf(i7));
    }

    public final void h(Context context) {
        Display display;
        Point point;
        String str;
        String[] split;
        DisplayManager displayManager;
        int i7 = H.f4603a;
        if (i7 >= 17 && (displayManager = (DisplayManager) context.getSystemService("display")) != null) {
            display = displayManager.getDisplay(0);
        } else {
            display = null;
        }
        if (display == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            windowManager.getClass();
            display = windowManager.getDefaultDisplay();
        }
        if (display.getDisplayId() == 0 && H.I(context)) {
            if (i7 < 28) {
                str = "sys.display-size";
            } else {
                str = "vendor.display-size";
            }
            String B6 = H.B(str);
            if (!TextUtils.isEmpty(B6)) {
                try {
                    split = B6.trim().split("x", -1);
                } catch (NumberFormatException unused) {
                }
                if (split.length == 2) {
                    int parseInt = Integer.parseInt(split[0]);
                    int parseInt2 = Integer.parseInt(split[1]);
                    if (parseInt > 0 && parseInt2 > 0) {
                        point = new Point(parseInt, parseInt2);
                        c(point.x, point.y);
                    }
                }
                AbstractC0156a.q("Util", "Invalid display size: " + B6);
            }
            if ("Sony".equals(H.f4605c) && H.d.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                point = new Point(3840, 2160);
                c(point.x, point.y);
            }
        }
        point = new Point();
        if (i7 >= 23) {
            Display.Mode mode = display.getMode();
            point.x = mode.getPhysicalWidth();
            point.y = mode.getPhysicalHeight();
        } else if (i7 >= 17) {
            display.getRealSize(point);
        } else {
            display.getSize(point);
        }
        c(point.x, point.y);
    }

    public g(h hVar) {
        b(hVar);
        this.f3806A = hVar.f3822Q;
        this.f3807B = hVar.f3823R;
        this.f3808C = hVar.f3824S;
        this.f3809D = hVar.f3825T;
        this.f3810E = hVar.f3826U;
        this.F = hVar.f3827V;
        this.f3811G = hVar.W;
        this.f3812H = hVar.f3828X;
        this.f3813I = hVar.f3829Y;
        this.f3814J = hVar.f3830Z;
        this.f3815K = hVar.f3831a0;
        this.f3816L = hVar.f3832b0;
        this.f3817M = hVar.f3833c0;
        this.f3818N = hVar.f3834d0;
        SparseArray sparseArray = new SparseArray();
        int i7 = 0;
        while (true) {
            SparseArray sparseArray2 = hVar.f3835e0;
            if (i7 >= sparseArray2.size()) {
                this.f3819O = sparseArray;
                this.f3820P = hVar.f3836f0.clone();
                return;
            }
            sparseArray.put(sparseArray2.keyAt(i7), new HashMap((Map) sparseArray2.valueAt(i7)));
            i7++;
        }
    }

    public g(Context context) {
        f(context);
        h(context);
        this.f3819O = new SparseArray();
        this.f3820P = new SparseBooleanArray();
        d();
    }
}
