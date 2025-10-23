package g3;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
/* loaded from: classes.dex */
public final class q implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    public final int f10813a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AbstractC0733b f10814b;

    public q(AbstractC0733b abstractC0733b, int i7) {
        this.f10814b = abstractC0733b;
        this.f10813a = i7;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        j jVar;
        AbstractC0733b abstractC0733b = this.f10814b;
        if (iBinder == null) {
            AbstractC0733b.e(abstractC0733b);
            return;
        }
        synchronized (abstractC0733b.f10763g) {
            try {
                AbstractC0733b abstractC0733b2 = this.f10814b;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                if (queryLocalInterface != null && (queryLocalInterface instanceof j)) {
                    jVar = (j) queryLocalInterface;
                } else {
                    jVar = new j(iBinder);
                }
                abstractC0733b2.f10764h = jVar;
            } catch (Throwable th) {
                throw th;
            }
        }
        AbstractC0733b abstractC0733b3 = this.f10814b;
        int i7 = this.f10813a;
        abstractC0733b3.getClass();
        s sVar = new s(abstractC0733b3, 0);
        o oVar = abstractC0733b3.f10762e;
        oVar.sendMessage(oVar.obtainMessage(7, i7, -1, sVar));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        AbstractC0733b abstractC0733b;
        synchronized (this.f10814b.f10763g) {
            abstractC0733b = this.f10814b;
            abstractC0733b.f10764h = null;
        }
        int i7 = this.f10813a;
        o oVar = abstractC0733b.f10762e;
        oVar.sendMessage(oVar.obtainMessage(6, i7, 1));
    }
}
