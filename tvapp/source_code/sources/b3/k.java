package b3;

import Z2.H;
import a3.o;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLSurfaceView;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.View;
import android.view.WindowManager;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes.dex */
public final class k extends GLSurfaceView {

    /* renamed from: B  reason: collision with root package name */
    public static final /* synthetic */ int f7109B = 0;

    /* renamed from: A  reason: collision with root package name */
    public boolean f7110A;

    /* renamed from: q  reason: collision with root package name */
    public final CopyOnWriteArrayList f7111q;

    /* renamed from: r  reason: collision with root package name */
    public final SensorManager f7112r;

    /* renamed from: s  reason: collision with root package name */
    public final Sensor f7113s;

    /* renamed from: t  reason: collision with root package name */
    public final C0368d f7114t;

    /* renamed from: u  reason: collision with root package name */
    public final Handler f7115u;

    /* renamed from: v  reason: collision with root package name */
    public final C0373i f7116v;

    /* renamed from: w  reason: collision with root package name */
    public SurfaceTexture f7117w;

    /* renamed from: x  reason: collision with root package name */
    public Surface f7118x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f7119y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f7120z;

    public k(Context context) {
        super(context, null);
        this.f7111q = new CopyOnWriteArrayList();
        this.f7115u = new Handler(Looper.getMainLooper());
        Object systemService = context.getSystemService("sensor");
        systemService.getClass();
        SensorManager sensorManager = (SensorManager) systemService;
        this.f7112r = sensorManager;
        Sensor defaultSensor = H.f4603a >= 18 ? sensorManager.getDefaultSensor(15) : null;
        this.f7113s = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        C0373i c0373i = new C0373i();
        this.f7116v = c0373i;
        C0374j c0374j = new C0374j(this, c0373i);
        View.OnTouchListener lVar = new l(context, c0374j);
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        windowManager.getClass();
        this.f7114t = new C0368d(windowManager.getDefaultDisplay(), lVar, c0374j);
        this.f7119y = true;
        setEGLContextClientVersion(2);
        setRenderer(c0374j);
        setOnTouchListener(lVar);
    }

    public final void a() {
        boolean z7;
        if (this.f7119y && this.f7120z) {
            z7 = true;
        } else {
            z7 = false;
        }
        Sensor sensor = this.f7113s;
        if (sensor != null && z7 != this.f7110A) {
            C0368d c0368d = this.f7114t;
            SensorManager sensorManager = this.f7112r;
            if (z7) {
                sensorManager.registerListener(c0368d, sensor, 0);
            } else {
                sensorManager.unregisterListener(c0368d);
            }
            this.f7110A = z7;
        }
    }

    public InterfaceC0365a getCameraMotionListener() {
        return this.f7116v;
    }

    public o getVideoFrameMetadataListener() {
        return this.f7116v;
    }

    public Surface getVideoSurface() {
        return this.f7118x;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f7115u.post(new E1.b(12, this));
    }

    @Override // android.opengl.GLSurfaceView
    public final void onPause() {
        this.f7120z = false;
        a();
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public final void onResume() {
        super.onResume();
        this.f7120z = true;
        a();
    }

    public void setDefaultStereoMode(int i7) {
        this.f7116v.f7085A = i7;
    }

    public void setUseSensorRotation(boolean z7) {
        this.f7119y = z7;
        a();
    }
}
