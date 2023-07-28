package com.example.chat.utiles;

import java.util.HashMap;

public class Constants {

    public static final String KEY_COLLECTION_USERS = "users";
    public static final String KEY_NAME = "name";
    public static final String KEY_EMAIL = "email";
    public static final String KEY_PASSWORD = "password";
    public static final String KEY_PREFERENCE_NAME = "chatAppPreference";
    public static final String KEY_IS_SIGNED_IN = "isSignedIn";
    public static final String KEY_USER_ID = "userId";
    public static final String KEY_IMAGE = "image";
    public static final String KEY_FCM_TOKEN = "fcmToken";

    public static final String KEY_USER = "user";
    public static final String KEY_COLLECTION_CHAT = "chat";
    public static final String KEY_SENDER_ID = "senderId";
    public static final String KEY_RECEIVER_ID = "receiverId";
    public static final String KEY_MESSAGE = "message";
    public static final String KEY_TIMESTAMP = "timestamp";
    public static final String KEY_COLLECTION_CONVERSIONS = "conversions";
    public static final String KEY_SENDER_NAME = "senderName";
    public static final String KEY_RECEIVER_NAME = "receiverName";
    public static final String KEY_SENDER_IMAGE = "senderImage";
    public static final String KEY_RECEIVER_IMAGE = "receiverImage";
    public static final String KEY_LAST_MESSAGE = "lastMessage";
    public static final String KEY_ONLINE = "online";
    public static final String REMOTE_MESSAGE_AUTHORIZATION = "Authorization";
    public static final String REMOTE_MSG_CONTENT_TYPE = "Content-Type";
    public static final String REMOTE_MSG_DATA = "data";
    public static final String REMOTE_MSG_REGISTRATION_IDS = "registration_ids";
    public static HashMap<String, String> remoteMsgHeaders = null;
    public static HashMap<String, String> getRemoteMsgHeaders(){
        if (remoteMsgHeaders == null){
            remoteMsgHeaders = new HashMap<>();
            remoteMsgHeaders.put(
            REMOTE_MESSAGE_AUTHORIZATION,
            "key=" + "AAAAoOnysL8:APA91bHoZ_-m0LK-U-EtNwXos5gF8I7Aaw3lb65fUTAOKPd0Bxl5q8X-i7nqJeHrp7xoasTJq0Tz5FhfnjG-EGzwboqiBUIBgTWz93sz-fJEsh7Ubv4MmijdTsykNaux5-qPEQk0ODI_"
            );
            remoteMsgHeaders.put(
                    REMOTE_MSG_CONTENT_TYPE,
                    "application/json"
            );
        }
        return remoteMsgHeaders;
    }
    public static final String DEFAULT_PROFILE_IMAGE =
            "/9j/4AAQSkZJRgABAQAAAQABAAD/4gIoSUNDX1BST0ZJTEUAAQEAAAIYAAAAAAQwAAB" +
                    "tbnRyUkdCIFhZWiAAAAAAAAAAAAAAAABhY3NwAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAQAA9tYAAQAAAADTLQAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAlkZXNjAAAA8AAAAHRy" +
                    "WFlaAAABZAAAABRnWFlaAAABeAAAABRiWFlaAAABjAAAABRyVFJDAAABoAA" +
                    "AAChnVFJDAAABoAAAAChiVFJDAAABoAAAACh3dHB0AAAByAAAABRjcHJ0AA" +
                    "AB3AAAADxtbHVjAAAAAAAAAAEAAAAMZW5VUwAAAFgAAAAcAHMAUgBHAEIAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAFhZWiAAAAAAAAB" +
                    "vogAAOPUAAAOQWFlaIAAAAAAAAGKZAAC3hQAAGNpYWVogAAAAAAAAJKAAAA" +
                    "+EAAC2z3BhcmEAAAAAAAQAAAACZmYAAPKnAAANWQAAE9AAAApbAAAAAAAAA" +
                    "ABYWVogAAAAAAAA9tYAAQAAAADTLW1sdWMAAAAAAAAAAQAAAAxlblVTAAAA" +
                    "IAAAABwARwBvAG8AZwBsAGUAIABJAG4AYwAuACAAMgAwADEANv/bAEMAEAs" +
                    "MDgwKEA4NDhIREBMYKBoYFhYYMSMlHSg6Mz08OTM4N0BIXE5ARFdFNzhQbV" +
                    "FXX2JnaGc+TXF5cGR4XGVnY//bAEMBERISGBUYLxoaL2NCOEJjY2NjY2NjY" +
                    "2NjY2NjY2NjY2NjY2NjY2NjY2NjY2NjY2NjY2NjY2NjY2NjY2NjY2NjY//A" +
                    "ABEIAJYAlgMBIgACEQEDEQH/xAAbAAEAAgMBAQAAAAAAAAAAAAAABQYCAwQ" +
                    "BB//EADwQAAEDAgIGCAMGBQUAAAAAAAEAAgMEEQUhBhIxQVFhEyJxgZGhwd" +
                    "EysfAUFiNCUmIzU4KS4RU1Q0Sy/8QAGQEAAwEBAQAAAAAAAAAAAAAAAAMEA" +
                    "gUB/8QAIxEAAwACAgICAwEBAAAAAAAAAAECAxESMQQhE0EUMlEiI//aAAwD" +
                    "AQACEQMRAD8A+foiIAIiIAIi9ALiA0Ek5ADegDxFMUWjVfVAOka2nYSP4nx" +
                    "W35e9lMRaJUbGAz1Ez3A5kWaD3Z/NMnFb+jDySinor43A8IjcHCmaTzc5w8" +
                    "LrccPwxzbGkgtyjATPx6MfNJ89RXl+j+EyMcGw6hP5myOuPE2XFU6IxFt6W" +
                    "pe1wBylAIJ3Zi1vNZeC0erLLKmikK/BK6gu6WLXjH/JH1m+471HpTTXpjE0" +
                    "+giIvD0IiIAIiIAIiIAIim8BwM15+01ILaVpyGzpOQ5c/oamXT0jxtSts5s" +
                    "KwSqxI6zR0UO+VwyOe7irfRYfRYY0injvIRYvObj3+y3l4a0RxAMY0WAAtY" +
                    "LBX48KkjvK6M3SuOw2HJYbUROFBFI0uCVc4DntELP37fD3sut2jh1Tq1QJt" +
                    "kCy3qlvNCemzax2/eiDQEjYbLrrMNqqO5kZdn625j/HeuRbTVLaMtNdmxsx" +
                    "HxZhR2J4FSYi18kIENSc9YbCeY9V2oCQbheVCpaZ7Nueih11BUYfMYqiMtN" +
                    "+q78ruYK5l9EqYIK+mdT1TbtOw7weI4FUjFcMmwyp6KTrMdmyS1g4fW5QZc" +
                    "Tj39FePIqOJERJGhERABEXrQXODWgkk2AG9AEjgWGnEq0NflBHZ0h4jh3+6" +
                    "urnANDIwGxtFgALCy5sPoxh1BHSggv+KRw3uP15Leujhx8F77Ist8mERE8U" +
                    "FO4BhzHMFZKLm/4YOzLf4qCV2pozFTRRk3LGBpPYFN5FuZ0vsdhlN7ZtREU" +
                    "BYeOaHNLXAFpFiDsKqmMUAoakdHfopBdt93EfLxVsUXpDGX4brA/A8OPy9U" +
                    "7Bbm9f0VllOdlYREXSIgsKqmixCkfSzgdYdVxFy124rNFlpNaZ6np7R8/qq" +
                    "eSkqZKeUWfGbHnz7FqVu0oovtNEKxn8WDJ+W1pPofVVFczJHCtF0VyWwiIs" +
                    "GwpfRmkFRiYleCWU46TZkXbhfdx7lEK16KxtZh0smqQ+SWxPEAC3mSm4Z5W" +
                    "kLyVqWTRNzcoiLpEIREXoBXHDJhPh0EmtrHUAcf3DI+apy7MIxT/TZzHLnT" +
                    "Sm5O9h4qfPDqfQ3DXF+y3otcM0dRE2WF4ex2wgrYueWhQ2kswbSxQh1nPfc" +
                    "ji0D3IXfW19PQR69RJa/wALRmXdgVRqauSvqnVMoDbjVa0bGhUYIbrYnLaU" +
                    "6MERF0CMIiIAarXtcyQXY8FrhxBVArKd1JWTU7r3jeW3ItcbjbntV/VU0qj" +
                    "a3E2SNaR0kQLjxIJHyAUvkz/lMfgr3ohURFCVhXbA2lmDUzXCx1SfFxI+ap" +
                    "KveGODsMpSNnRNHgLKnxv2YjP+qOpERXkgREQAXjgHCx2LOOKSV2rExz3cG" +
                    "i5UpT6P1EgvNI2IcPiPt5rFXM9s1M1XRCME9O8vp5XsJFrtcWmy6H4lij4w" +
                    "w1MgA/SQD4jNT0WjsIB6WeRx/aA33Wf3epP5k/8AcPZIeXE2NWPIVUROc8v" +
                    "lcXOJuSTe55lbVYJNHIy78Opc1vBzbn0XDVYJVwAuYBM39m3w9rpk5cb9Jm" +
                    "Kx2u0RyIQWkhwIIyIO5E0WERF6AVf0taTFSuA6rXPBPM29irAoTSpwGHxN3" +
                    "mUHwB90nMv+bGYv3RVURFzS4K5aPPa/B4QHXLC4O5G5PyIVNVl0UnBhnpzY" +
                    "FrtcZ5m+Ry5WHiqPHerE5luSwIiLoEYXRQ0j62pETCBvc47hxXOrLo9TiOh" +
                    "M2WtK7yGXzulZb4Ts3jnlWjvpaSGkiDIWAZZu3u7St6Iua229suS10ERF4e" +
                    "hERAHBiWGRVsZc0NZOMw+23kVVJGOjkcx4s5pII4FXpVvSOnEdWyYW/Fbn2" +
                    "j/FlX4+R74snzQtckRCIitJQq3pY9pfTRg9YBziORtb5FWRU7SOcTYq4Nta" +
                    "JoZcG9958zbuU/kPUDcK3ZFoiLnloXdg1Z9ixGOQmzHdR/YfoHuXCi9luXt" +
                    "HjW1o+ioovAcQFZSCOR954hZ19pG4qUXVmlS2jn0nL0wrZgf+0wf1f+iqmu" +
                    "7CsYdQTdDUXdTOOR26h4jly+irPLqPQzDSmvZbUWEUsc0Ykie17HbHNNwVm" +
                    "ucWhERABERABQOk/wD1v6/RStbXU9DF0lQ8N26rd7uwKpVVfNiM7pZeqwZM" +
                    "YDk0fW9UePLdchOalx0akRF0CM01dQ2lpZJ37GNvbidwVClkdLK+R5u55Li" +
                    "eJKntJcQD3CjhfcNN5LbzuHd9bFX1z/IvlWl9FeGdLbCIinHhERAHRQ1clF" +
                    "VMmjJyOYv8Q3hXakqoqynbNC67TuO0HgVQV2YdiEuHz68ebT8bDscE/Dl4P" +
                    "T6E5cfL2uy8rFzQ5titNHWQVsIkgeHC2bd7eRC6F0E016I+jGCerona1LM9" +
                    "ovewOR7RsKk4dKahlxPTRv4apLfHao5eEAixF0usU12jc5KnosDdKaOw1oZ" +
                    "wd4AB9U+9FD/KqP7W+6rpiYfyhedDH+nzS/x5N/PRYJdKqYN/Bp5Xu4Ps0e" +
                    "Oa4J9Ja2YubBHHEDsIGs4eOXko8RsH5QslpYIR481M1ubLO/XqJHyOttc4k" +
                    "+K2bF6ickkKb2FHYxibKCnLWm87x1G8OZTFcWioIy1pa+c7GX2cyqfPNJUT" +
                    "OllcXvcbklT5s3H0ux2LFy9vowc5z3FziXOJuSTckrxEUBYEREAEREAEREA" +
                    "baeolppRJBI5jxvG/t4qy0GkUMo1asdC/9QuWn2VVRMjLUdGLxquz6Gx7JG" +
                    "B8bmvadjmm4KyVAp6qemdrQSvjNwTqnI24jepKLSStY0B4ikttc5tifA28l" +
                    "VPky+yd4Gui2oq83ShpcNekIHESX9FtOk1Lq9WGYngbD1TPmx/0X8V/wnEV" +
                    "bfpQ4tIjpAHbi59x4WXHUaQV8zdUPZELEHo25nvN/JZfkQjSw0y1VFVBSs1" +
                    "55Wxjdc5nsG9QGJaROeHRUQLWnLpTtPYN31sUFJK+V5fI9z3na5xuSsFPfk" +
                    "VXpeh0YUvbPXOc9xc4lzibkk3JK8RFOPCIiACIiACIiACIiACIiACIiACIi" +
                    "ACIiACIiACIiACIiACIiAP/2Q==";

}
