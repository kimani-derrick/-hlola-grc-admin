package b3;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.view.Display;
/* renamed from: b3.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0368d implements SensorEventListener {

    /* renamed from: a  reason: collision with root package name */
    public final float[] f7066a = new float[16];

    /* renamed from: b  reason: collision with root package name */
    public final float[] f7067b = new float[16];

    /* renamed from: c  reason: collision with root package name */
    public final float[] f7068c = new float[16];
    public final float[] d = new float[3];

    /* renamed from: e  reason: collision with root package name */
    public final Display f7069e;
    public final InterfaceC0367c[] f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f7070g;

    public C0368d(Display display, InterfaceC0367c... interfaceC0367cArr) {
        this.f7069e = display;
        this.f = interfaceC0367cArr;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        int i7;
        float[] fArr = sensorEvent.values;
        float[] fArr2 = this.f7066a;
        SensorManager.getRotationMatrixFromVector(fArr2, fArr);
        int rotation = this.f7069e.getRotation();
        float[] fArr3 = this.f7067b;
        if (rotation != 0) {
            int i8 = 129;
            if (rotation != 1) {
                i7 = 130;
                if (rotation != 2) {
                    if (rotation == 3) {
                        i8 = 130;
                        i7 = 1;
                    } else {
                        throw new IllegalStateException();
                    }
                }
            } else {
                i7 = 129;
                i8 = 2;
            }
            System.arraycopy(fArr2, 0, fArr3, 0, fArr3.length);
            SensorManager.remapCoordinateSystem(fArr3, i8, i7, fArr2);
        }
        SensorManager.remapCoordinateSystem(fArr2, 1, 131, fArr3);
        float[] fArr4 = this.d;
        SensorManager.getOrientation(fArr3, fArr4);
        float f = fArr4[2];
        Matrix.rotateM(this.f7066a, 0, 90.0f, 1.0f, 0.0f, 0.0f);
        boolean z7 = this.f7070g;
        float[] fArr5 = this.f7066a;
        if (!z7) {
            L0.b.c(this.f7068c, fArr5);
            this.f7070g = true;
        }
        System.arraycopy(fArr5, 0, fArr3, 0, fArr3.length);
        Matrix.multiplyMM(fArr5, 0, this.f7067b, 0, this.f7068c, 0);
        for (InterfaceC0367c interfaceC0367c : this.f) {
            interfaceC0367c.a(fArr2, f);
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i7) {
    }
}
