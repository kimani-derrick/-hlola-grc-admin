package I3;

import android.graphics.Paint;
import android.graphics.Path;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: i  reason: collision with root package name */
    public static final int[] f1243i = new int[3];

    /* renamed from: j  reason: collision with root package name */
    public static final float[] f1244j = {0.0f, 0.5f, 1.0f};

    /* renamed from: k  reason: collision with root package name */
    public static final int[] f1245k = new int[4];

    /* renamed from: l  reason: collision with root package name */
    public static final float[] f1246l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: a  reason: collision with root package name */
    public final Paint f1247a;

    /* renamed from: b  reason: collision with root package name */
    public final Paint f1248b;

    /* renamed from: c  reason: collision with root package name */
    public final Paint f1249c;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public int f1250e;
    public int f;

    /* renamed from: g  reason: collision with root package name */
    public final Path f1251g = new Path();

    /* renamed from: h  reason: collision with root package name */
    public final Paint f1252h;

    public a() {
        Paint paint = new Paint();
        this.f1252h = paint;
        Paint paint2 = new Paint();
        this.f1247a = paint2;
        this.d = D.a.d(-16777216, 68);
        this.f1250e = D.a.d(-16777216, 20);
        this.f = D.a.d(-16777216, 0);
        paint2.setColor(this.d);
        paint.setColor(0);
        Paint paint3 = new Paint(4);
        this.f1248b = paint3;
        paint3.setStyle(Paint.Style.FILL);
        this.f1249c = new Paint(paint3);
    }
}
