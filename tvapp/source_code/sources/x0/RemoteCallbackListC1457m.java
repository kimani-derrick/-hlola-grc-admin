package x0;

import android.os.IInterface;
import android.os.RemoteCallbackList;
import androidx.room.MultiInstanceInvalidationService;
/* renamed from: x0.m  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RemoteCallbackListC1457m extends RemoteCallbackList {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MultiInstanceInvalidationService f16173a;

    public RemoteCallbackListC1457m(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f16173a = multiInstanceInvalidationService;
    }

    @Override // android.os.RemoteCallbackList
    public final void onCallbackDied(IInterface iInterface, Object obj) {
        M5.g.f((InterfaceC1452h) iInterface, "callback");
        M5.g.f(obj, "cookie");
        this.f16173a.f6985r.remove((Integer) obj);
    }
}
