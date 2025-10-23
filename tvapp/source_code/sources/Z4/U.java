package Z4;

import W5.AbstractC0117y;
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Messenger;
import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingDeque;
/* loaded from: classes.dex */
public final class U implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C4.b f4795a;

    public U(C4.b bVar) {
        this.f4795a = bVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        StringBuilder sb = new StringBuilder("Connected to SessionLifecycleService. Queue size ");
        C4.b bVar = this.f4795a;
        sb.append(((LinkedBlockingDeque) bVar.f423t).size());
        Log.d("SessionLifecycleClient", sb.toString());
        bVar.f422s = new Messenger(iBinder);
        ArrayList arrayList = new ArrayList();
        ((LinkedBlockingDeque) bVar.f423t).drainTo(arrayList);
        AbstractC0117y.p(AbstractC0117y.a((D5.i) bVar.f421r), null, 0, new T(bVar, arrayList, null), 3);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Log.d("SessionLifecycleClient", "Disconnected from SessionLifecycleService");
        C4.b bVar = this.f4795a;
        bVar.f422s = null;
        bVar.getClass();
    }
}
