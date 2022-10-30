export default class HttpUtil {
    constructor() {}

    get(hostname, path) {
        return fetch(`${hostname}${path}`)
    }

    post(hostname, path, obj) {
        const opt = {
            method: 'post',
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json',
                'Access-Control-Allow-Origin': '*'

            },
            body: JSON.stringify(obj)
        };

        return fetch(`${hostname}${path}`, opt);
    }
}
