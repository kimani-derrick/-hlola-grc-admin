package H;

import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import android.util.Log;
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f773a;

    /* renamed from: b  reason: collision with root package name */
    public final ContentProviderClient f774b;

    public c(Context context, Uri uri, int i7) {
        this.f773a = i7;
        switch (i7) {
            case 1:
                this.f774b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
                return;
            default:
                this.f774b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
                return;
        }
    }

    public final void a() {
        switch (this.f773a) {
            case 0:
                ContentProviderClient contentProviderClient = this.f774b;
                if (contentProviderClient != null) {
                    contentProviderClient.release();
                    return;
                }
                return;
            default:
                ContentProviderClient contentProviderClient2 = this.f774b;
                if (contentProviderClient2 != null) {
                    contentProviderClient2.release();
                    return;
                }
                return;
        }
    }

    public final Cursor b(Uri uri, String[] strArr, String[] strArr2) {
        switch (this.f773a) {
            case 0:
                ContentProviderClient contentProviderClient = this.f774b;
                if (contentProviderClient == null) {
                    return null;
                }
                try {
                    return contentProviderClient.query(uri, strArr, "query = ?", strArr2, null, null);
                } catch (RemoteException e3) {
                    Log.w("FontsProvider", "Unable to query the content provider", e3);
                    return null;
                }
            default:
                ContentProviderClient contentProviderClient2 = this.f774b;
                if (contentProviderClient2 == null) {
                    return null;
                }
                try {
                    return contentProviderClient2.query(uri, strArr, "query = ?", strArr2, null, null);
                } catch (RemoteException e7) {
                    Log.w("FontsProvider", "Unable to query the content provider", e7);
                    return null;
                }
        }
    }
}
