import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { map } from 'rxjs/operators';
import { of as observableOf, Observable } from 'rxjs';
import { delay } from 'rxjs/operators';

@Injectable({ providedIn: 'root' })
export class AuthenticationService {
    urlServer: string;

    constructor(private http: HttpClient) {
        this.urlServer = 'http://localhost:8080';
     }

    login(username: string, password: string) {

        return this.http.post<any>(`${this.urlServer}/auth`, { username, password })
            .pipe(map(userw => {

                const user = {
                    username: username,
                    authdata: userw.token
                };
                localStorage.setItem('currentUser', JSON.stringify(user));
                return user;
            }));
    }

    getAuthToken() {
        debugger;
        const currentUser = JSON.parse(localStorage.getItem('currentUser')) ? JSON.parse(localStorage.getItem('currentUser')) : {authdata : ''};
        return currentUser.authdata;
    }

    fetchUser(username: string, password: string) {

        const httpOptionsd = {
            headers: new HttpHeaders({
                'Content-Type': 'application/json;charset=UTF-8',
                'Authorization': 'Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJ3bGNsaW1hY285QGdtYWlsLmNvbSIsImV4cCI6MTU0OTUwNDM1MiwiaWF0IjoxNTQ4ODk5NTUyfQ.ByefRJD46FoDVjWKTxtJkfxgGzPP8SRL3W_apyUFnxE5FKlmximSQjmPanmozXi3mtrUMvp7mMRqEhCtwRtpLw'
            })
        };

        const userRequest = { 'username': username };
        return this.http.post<any>(`${this.urlServer}/user/findUserByEmail`, {'username': 'wlclimaco@gmail.com', 'password': 'admin'})
            .pipe(map(user => {
                debugger;
                // login successful if there's a user in the response
                if (user) {
                    // store user details and basic auth credentials in local storage
                    // to keep user logged in between page refreshes
                    user.authdata = window.btoa(username + ':' + password);
                    localStorage.setItem('currentUser', JSON.stringify(user));
                }

                return user;
            }));

    }
    logout() {
        // remove user from local storage to log user out
        localStorage.removeItem('currentUser');
    }
}
